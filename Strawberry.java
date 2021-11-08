package com.nology;

// Inheritance
// - Inherits properties and methods from a "superclass" or parent class
// - "Extends" from a superclass, so the functionality only has to be defined once
// - "subclass" has everything the "superclass" has, plus more.
        // - Method overriding
        // - New methods and attributes
// - Defines an "is a" relationship
// - Constructor in the subclass uses the constructor in the superclass

public class Strawberry extends Fruit implements IBerry{
    private boolean isRed = true; // Extra attribute
    private boolean isSquashed = false;
    public Strawberry(double weight) {
        super("Strawberry", weight);
    }

    // Extra method
    public void useInEtonMess() {
        System.out.println("delish");
    }

    // Method overriding
    @Override
    public void rot() {
        System.out.println("Time for strawberry wine!");
    }

    @Override
    public void squash() {

    }
}
