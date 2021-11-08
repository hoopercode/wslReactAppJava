package com.nology;

public class Main {

    public static void main(String[] args) {
        // Encapsulation
        Fruit kumquat = new Fruit("kumquat", 0.03);

        // Inheritance
        Strawberry myStrawberry = new Strawberry(0.05);
    }

    private String makeBerryPie(IBerry berry) {
        berry.squash();

        return "What a lovely berry pie";

    }
}
