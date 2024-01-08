//if
//if...else
//else...if
//ternary operatore

import java.util.Scanner;

public class condizioni {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        //esempio 1
        boolean isOnline = true;          
        if(isOnline == true) {      //Se la variabile "isOnline == true" allora avviene la stampa su schermo
        System.out.println("isOnline");
    } 
    //esempio 2
    if(33 < 10) {
        System.out.println("Corretto");     //in questa condizione non viene stampato nulla perchè 33 non è < di 10, tuttavia il programma non ferma l'esecuzione
     //aggiungo una condizione else: se 33 < 10 stampa "corretto" altrimenti "falso", avverrà solo la stampa su schermo "Falso" 
    } else {
        System.out.println("Falso");
    }

    //esempio 3
    String n1 = "Luca" , n2 = "Marco" , n3 = "Giancarlo" , n4 = "Elisa";
    if (n1 == "Luca") {
        System.out.println("è Luca");
    } else if(n1 == "Marco") {
        System.out.println("è Marco");
    } else {
        System.out.println("è qualcun altro");
    }
    if (!(n2 == "Giancarlo")) {
        System.out.println("è marco");
    } else if(n2 == "Elisa") {
        System.out.println("è elisa, non Marco");
    }

    //esempio 4 (inserire età e verificare tramite una condizione if...else se <18 oppure >18)
    System.out.println("Inserire età: ");
    int age = input.nextInt();
    if(age < 18) {
        System.out.println("Età minore di 18 anni");
    } else {
        System.out.println("Età maggiore di 18 anni");
    }

    //esempio 5
    
}
}