package org.example;

import java.util.List;
import java.util.Random;

public class Gift {
    private String[] possibleGifts;
    private int[] prices;
    private int[] quantities;

    public Gift(String[] gifts, int[] prices, int[] quantities) {
        this.possibleGifts = gifts;
        this.prices = prices;
        this.quantities = quantities;
    }

    public void assingGifts(List<Osoby> Listaosob){
        Random random = new Random();

        for(Osoby osoba : Listaosob ){
            int randGiftIndex;
            do {
                randGiftIndex = random.nextInt(possibleGifts.length);
            }while (quantities[randGiftIndex] <= 0);
            String gift = possibleGifts[randGiftIndex];
            osoba.setGift(gift);
            quantities[randGiftIndex]--;
            System.out.println(osoba.getName()+" otrzyma "+gift+" o wartosci "+ prices[randGiftIndex]+" zl");
        }
    }

}