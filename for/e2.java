import java.util.Scanner;
public class e2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int i;
         int product = 1;
         System.out.println("Enter number: ");
         int num = input.nextInt();
         for(i = 0; i <= 10; i++) {
          product = num * i;
          System.out.println(num+ " * " +i+ " = " +product);
         }
        
    }
}