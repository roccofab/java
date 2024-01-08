import java.util.Scanner;
public class example4 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter string: ");
         String s = input.nextLine();
         int i = 0;
         while(i <= s.length()) {
            i++;
            char c = s.charAt(i);
            System.out.println(c);
         }
    }
}