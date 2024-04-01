package org.example;

public class Pachyderm extends Animal{
    private double factor;
    public Pachyderm(String name, int weight, double factor) {   //constructor for the subclass Pachyderm
        super(name, weight);
    }
    public double FeedCost() {   //get alimentation cost for the pachyderms
        factor = 4;
        return weight * factor;
    }
}
