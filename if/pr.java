import java.util.Scanner;
public class pr {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       System.out.println("Inserire base: ");
       double b = input.nextDouble();

       System.out.println("Inserire altezza: ");
       double h = input.nextDouble();
       double a;
       if(b > 0 && h > 0) {
        a = b * h;
        System.out.println(a);
       } else {
        System.out.println("Inserire dati corretti!");
       }
        
         
    }
}