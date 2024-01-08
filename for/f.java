import java.util.Scanner;
import java.util.Random;
public class f {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int [] ar = {1, 20, 10, 20, 10, 1,1,10,20,20,20,10,1,1,20,20,20,10,10,10,1,1,1,1,1,1,1,10,20};
        int minimo = ar[0];
        for(int j : ar) {
         if(j<minimo) {
          minimo = ar[j];
         }
    } System.out.println("Il valore minimo è " +minimo);
  }
}


