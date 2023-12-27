package org.example;


public class Christmastree {
    public static void Budowa(int wysokosc){
        for(int i = 0; i < wysokosc +1; i++){
            for(int j = 0; j < wysokosc - i; j++  ){
                System.out.print(" ");
            }
            for(int a = 0; a < i*2-1 ; a++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void BudowaR(int wysokosc, int aktwysokosc){
        if(aktwysokosc < wysokosc + 1){
            WpiszSpacja(wysokosc - aktwysokosc - 1);
            WpiszGwiazdka(aktwysokosc*2 -1);
            System.out.println();
            BudowaR(wysokosc, aktwysokosc+1 );
        }
    }
    public static void WpiszSpacja(int licznik){
        if(licznik +1 > 0){
            System.out.print(" ");
            WpiszSpacja(licznik-1);
        }
    }
    public static void WpiszGwiazdka(int licznik){
        if(licznik > 0){
            System.out.print("*");
            WpiszGwiazdka(licznik-1);
        }

    }

}