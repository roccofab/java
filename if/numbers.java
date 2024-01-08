import java.util.Scanner;
public class numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire numero: ");
        int x = input.nextInt();
         if(x % 2 == 0) {
            System.out.println("Even!");
        } else {
            System.out.println("Odd");
        }
        System.out.println("Inserire numero: ");
        int y = input.nextInt();
         if(y % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}