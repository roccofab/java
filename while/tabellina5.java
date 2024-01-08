import java.util.Scanner;
public class tabellina5 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int nt = 5;
         int i = 1;
         while (i < 10) {
             i++;
            int rt = i * nt;
            System.out.println(nt+ " * " +i+ " = " +rt);
         }
    }
}