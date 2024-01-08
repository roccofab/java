import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] [] ar = {
            {1, 2, 3, 4, 5},
            {6,7,8,9,10},
            {11, 12, 13, 14, 15}
        };
        System.out.println("Search: ");
        int element = input.nextInt();
        int sum = 0;
        int count = 0;
        for(int [] i : ar) {
          for(int j : i) {
            sum += j;
            if(j == element) {
               count++;
            }
            System.out.print(j+ "\t ");
          }
        }
        System.out.println("\n" +sum);
        if(count > 0) {
            System.out.println("The element is stored " +count+ " times");
        } else {
            System.out.println("The element is not stored");
        }
    }
}