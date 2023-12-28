package org.example;

public class Osoby {
    private String name;
    private String gift;

    public Osoby(String name) {
        this.name = name;
    }

    public Osoby() {
    }

    public Osoby(String name, String prezent) {
        this.name = name;
        this.gift = prezent;
    }


    public void setGift(String gift) {
        this.gift = gift;
    }

    public String getName() {
        return name;
    }

    public String getGift() {
        return gift;
    }
}
