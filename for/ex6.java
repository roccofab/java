import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] enumeration = {10.7, 11.3, 12, 23, 251};
        double somma = 0;
        for( double numero : enumeration) {
           somma += numero;
        }
        System.out.println(somma);
    }
}