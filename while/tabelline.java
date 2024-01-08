import java.util.Scanner;
public class tabelline {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int num = input.nextInt();
         int i = 0;
         while(i < 10) {
            i++;
            int rst = i * num;
            System.out.println(num+ " * " +i+ " = " +rst);
         }
    }
}
