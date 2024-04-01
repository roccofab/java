package org.example;

public class Animal {
    public String name;
    public int weight;

    public Animal(String name, int weight) {   //constructor for the class Animal
        this.name = name;
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Animal: " + name + " (weight: " + weight + ")";
    }
}
