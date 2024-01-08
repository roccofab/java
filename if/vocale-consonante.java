import java.util.Scanner;
public class vocaleconsonante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
        System.out.println("Enter char: ");
        String userInput = input.next();
        if (userInput.equalsIgnoreCase("exit")) {
                break; // Esci dal ciclo se l'utente inserisce 'exit'
            }
            char cr = userInput.charAt(0);
        if(cr == 'a' || cr == 'e' || cr == 'i' || cr == 'o' || cr == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("Consonant");
        }
    }
    }
    }
