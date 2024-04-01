package org.example;

public class Feline extends Animal{
    private int factor;

    public Feline(String name, int weight, int factor) {   //constructor for the subclass Feline
        super(name, weight);
    }
    public double FeedCost() {   //get alimentation cost for the Feline
        factor = 3;
        return weight * factor;
    }
}
