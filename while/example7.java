import java.util.Scanner;
public class example7 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("\t\tBenvenuto");
        System.out.println("\t\tnel mio programma");
        System.out.println("\t\tcalcola le potenze");
        System.out.println("Inserire base: ");
        int b = input.nextInt();

        System.out.println("Quante potenze vuoi calcolare: ");
        int e = input.nextInt();
        int i = 0;
        while(i < e) {
            i++;
            double r = Math.pow(b, i) ;
            
            System.out.println(r);
        }
    }
}