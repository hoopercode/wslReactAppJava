package com.nology;

public class Blueberry extends Fruit implements IBerry{

    public Blueberry(String variety, double weight) {
        super(variety, weight);
    }

    @Override
    public void squash() {

    }
}
