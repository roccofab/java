import java.util.Scanner;
public class lk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number: ");
        int num1 = input.nextInt();
        System.out.println("enter number: ");
        int num2 = input.nextInt();
        int result = num1 % num2;
        System.out.println(result);
    }
}