package org.example;
import java.util.Random;

public class Oasi {
  public Animal[] V;   //V contain Animals: even positions-felins and odd positions-pachyderms and mammals
  private int index;

    public Oasi(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid size: " + n);
        }
        V = new Animal[n];
        index = 0;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                V[index++] = new Feline(GenerateFeline(), GenerateFelineWeight("Jaguar"), 3);  //felines in the even positions
            } else {    //pachyderms and mammals in the odd positions
                if (index + 1 < n) {
                    V[index++] = new Pachyderm(GeneratePachyderm(), GeneratePachydermWeight(), 3);
                    V[index++] = new Mammal(GenerateMammal(), GenerateMammalWeight("Gazelle"), 2);
                } else {
                    break;
                }
            }
        }
    }
  public void printOasiAnimals() {
      for (Animal animal : V) {
          System.out.println(animal);
      }
  }
  public String GenerateFeline() {  //method to generate feline's name
    String[] names = {"Lion", "Tiger", "Jaguar","Hyena", "Leopard", "Coyote", "Wolf"};
    Random rand = new Random();
    return names[rand.nextInt(names.length)];
  }
  public String GeneratePachyderm() {  //method to generate pachyderm's name
    String[] names = {"Rhyno", "Hippo", "Giraffe"};
    Random rand = new Random();
    return names[rand.nextInt(names.length)];
  }
public String GenerateMammal() {   //method to generate mammal's name
    String[] names = {"Bison", "Gazelle", "Kangaroo", "Elk", "Tapir", "Zebra", "Bull"};
    Random rand = new Random();
    return names[rand.nextInt(names.length)];
}
public int GenerateFelineWeight(String name) {  //method to generate a random number between 50 and 400 that represent the feline's weight
    Random rand = new Random();
    int min = 50;
    int max = 400;
    if(name.equals("Jaguar") || name.equals("Hyena") || name.equals("Leopard") || name.equals("Wolf")) {  //I added weight restrictions for specific animals
        max = 150;
    }
    if(name.equals("Coyote")) {
        max = 70;
    }
    return rand.nextInt(max - min) + min;
}
public int GeneratePachydermWeight() {   //method to generate a random number between 100 and 2500 that represent the pachyderm's weight
    Random rand = new Random();
    int min = 410;
    int max = 2500;
    return rand.nextInt(max - min) + min;
}
public int GenerateMammalWeight(String name) {  //method to generate a random number between 50 and 1000 that represent the mammal's weight
    Random rand = new Random();
    int min = 60;
    int max = 1000;
    if( name.equals("Kangaroo") || name.equals("Tapir") || name.equals("Zebra")) {  //I added weight restrictions for specific animals
        max = 200;
    }
    if (name.equals("Gazelle")) {
        max = 70;
    }
    return rand.nextInt(max - min) + min;
}
public void GetMaxFeedCostAnimal() {
  double maxFeedCost = 0;
  String maxFeedCostAnimalName = "";
  for (Animal animal : V) {
      double feedCost = 0;  //this variable is used to store the feeding cost of the current animal
      if (animal instanceof Feline) {
          feedCost = ((Feline)animal).FeedCost();  //calculate the feeding cost of the current animal using the method FeedCost() of the class Feline
      } else if(animal instanceof Pachyderm) {
          feedCost = ((Pachyderm)animal).FeedCost();  //calculate the feeding cost of the current animal using the method FeedCost() of the class Pachyderm
        } else if(animal instanceof Mammal) {
           feedCost = ((Mammal)animal).FeedCost();   //calculate the feeding cost of the current animal using the method FeedCost() of the class Mammal
      }
      if (feedCost > maxFeedCost) {  //find the animal that require the maximum feeding cost
          maxFeedCost = feedCost;
          maxFeedCostAnimalName = animal.name;
      }
  }
    System.out.println("Max Feed Cost: " + maxFeedCost + " (Animal: " + maxFeedCostAnimalName + ")");
}
}
