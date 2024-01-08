import java.util.Scanner;
public class vocaleconsonante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter char: ");
        int cr = input.next().charAt(0);
        if(cr == 'a' || cr == 'e' || cr == 'i' || cr == 'o' || cr == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}