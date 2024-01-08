import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int x = 1;
         int s = 0;
         while (x < 100) {
            x++;
            s += x;
           System.out.println(s);
         }
    }
}