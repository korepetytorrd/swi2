package org.example;

public class Osoby {
    private String name;
    private String gift;

    public Osoby(String name) {
        this.name = name;
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
