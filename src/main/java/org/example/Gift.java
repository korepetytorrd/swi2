package org.example;

public class Gift {
    private String[] possibleGifts;
    private int[] prices;
    private int[] quantities;

    public Gift(String[] gifts, int[] prices, int[] quantities) {
        this.possibleGifts = gifts;
        this.prices = prices;
        this.quantities = quantities;
    }


}