import java.util.Scanner;
public class ex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5;
        int product = 0;
       while(product <= 10) {
        int result = num * product;
        product++;
        System.out.println(result);
       }
        
    }
}