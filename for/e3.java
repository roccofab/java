import java.util.Scanner;
public class e3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("enter string: ");
         String phrase = input.nextLine();
         
         for(int i = 0; i < phrase.length(); i++) {
            char character = phrase.charAt(i);
            System.out.println(character);
         }
    }
}