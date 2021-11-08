package com.nology;

// Encapsulation
// - "control how the developer uses the code"
// - use private as your default, for anything that counts as the "inner workings"
// - specific public methods to allow access
// - public getters and setters (if desired)
// - specific data inputted in constructors

public class Fruit {
    // private attributes
    private final String variety; // Can't be changed once its initialised
    private final double weight;
    private int tastiness = 0;
    private boolean isFresh = true;

    // Constructor gives access to SOME of the attributes
    public Fruit(String variety, double weight) {
        this.variety = variety;
        this.weight = weight;
    }

    // - specific public methods to allow access
    public void rot() {
        isFresh = false;
    }

    public void beEatenAndRated(int tastiness) {
        this.tastiness = tastiness;
        System.out.println("You ate the fruit and gave it a rating of: " + tastiness);
    }
}
