import java.util.Scanner;
public class example11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int counter = 0;
        int temp = 0;
        
        do {
            System.out.println("Enter number(0 to exit): " );
            n = input.nextInt();

            if(n != 0) {
                temp = n;
                counter = 0;
            }
            while(temp != 0) {
                counter++;
                temp /= 10;
            }
            System.out.println(counter+ " digits ");
        } while(n != 0);
     }
}