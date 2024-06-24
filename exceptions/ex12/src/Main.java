import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void exc(int[] arr) {
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i < 7; i++) {
                int a = sc.nextInt();
                arr[i] = a;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally{
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        exc(arr);
    }
}