package org.example;
public class Mammal extends Animal {
    private double factor;

    public Mammal(String name, int weight, double factor) {
        super(name, weight);
    }
    public double FeedCost() {
        factor = 2;
        return weight * factor;
    }
}
