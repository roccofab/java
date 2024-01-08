import java.util.Scanner;
public class example3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n = 5;
         int t = 0;
         int r = 1;
         while(t < 100) {
            t++;
            r =n * t;
            System.out.println(r);
         }
    }
}