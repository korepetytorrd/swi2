package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] gifts = {"myszka","gra planszowa","monitor"};
        int[] prices = {100,150,700};
        int[] quantities = {10,5,7};

        Gift gift = new Gift(gifts,prices,quantities);
        List<Osoby>people = Arrays.asList(new Osoby("Jan"),new Osoby("Kamil"), new Osoby("Anna"));
        gift.assingGifts(people);
        /*
        Christmastree christmastree = new Christmastree();
        christmastree.Budowa(10);
        christmastree.BudowaR(10,0);

        Scanner scanner = new Scanner(System.in);

        Osoby osoby = new Osoby("Tomek");

        Osoby osoby1 = new Osoby();

        Osoby osoby2 = new Osoby("Radek","Myszka");


        osoby.setGift("Kubek");



        System.out.println(osoby.getName());
        System.out.println(osoby.getGift());
*/

    }
}