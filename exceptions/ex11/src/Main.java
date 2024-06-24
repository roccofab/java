import java.util.*;

public class Main {
    public static double divide() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter Number: ");
        double a = sc.nextDouble();
        double b = rand.nextDouble(3);
        if(a == 0){
            throw new ArithmeticException();
        }
        double c = a / b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        divide();
    }
}