import java.util.Scanner;
public class e4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        
        for(int i = 0; i <= num; i++) {
           int pow = i * i;
           System.out.println(pow);
        }
    }
}