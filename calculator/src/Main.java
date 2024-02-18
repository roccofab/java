import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Addition(+), Subtraction(-), Multiplication(*), Division(/), Quozient(%)\n, Power(pow)\n, Square Root(sqrt), Cubic Root(cbrt), N-root(Nth)\n, log(ln), log10(log10)\n, exponential(exp)\n, Absolute Value(abs)\n,  Factorial(fact)\n");
        String choice = scan.nextLine();
        calculate Value = new calculate();
        switch(choice) {
            case "+":
                System.out.println("Enter the values:");
                double input1 = scan.nextDouble();
                double input2 = scan.nextDouble();
                System.out.println(Value.addition(input1, input2));
                break;

            case "-":
                System.out.println("Enter the values:");
                double input3 = scan.nextDouble();
                double input4 = scan.nextDouble();
                System.out.println(Value.subtraction(input3, input4));
                break;

            case "*":
                System.out.println("Enter the values:");
                double input5 = scan.nextDouble();
                double input6 = scan.nextDouble();
                System.out.println(Value.multiplication(input5, input6));
                break;

            case "/":
                System.out.println("Enter the values:");
                double input7 = scan.nextDouble();
                double input8 = scan.nextDouble();
                System.out.println(Value.division(input7, input8));
                break;

            case "%":
                System.out.println("Enter the Values:");
                double input9 = scan.nextDouble();
                double input10 = scan.nextDouble();
                System.out.println(Value.rest(input9, input10));
                break;

            case "pow":
                System.out.println("Enter base and exponent:");
                double input11 = scan.nextDouble();
                double input12 = scan.nextDouble();
                System.out.println(Value.power(input11, input12));
                break;

            case "sqrt":
                System.out.println("Enter Value:");
                double input13 = scan.nextDouble();
                System.out.println(Value.sqrt(input13));
                break;

            case "cbrt":
                System.out.println("Enter Value:");
                double input14 = scan.nextDouble();
                System.out.println(Value.cbrt(input14));
                break;

            case "Nth":
                System.out.println("Enter the Values: ");
                double input15 = scan.nextDouble();
                double input16 = scan.nextDouble();
                System.out.println(Value.calculateNroot(input15, input16));
                break;

            case "ln":
                System.out.println("Enter Value: ");
                double input17 = scan.nextDouble();
                System.out.println(Value.log((input17)));
                break;

            case "log10":
                System.out.println("Enter Value: ");
                double input18 = scan.nextDouble();
                System.out.println(Value.log10((input18)));
                break;


            case "exp":
                System.out.println("Enter Value: ");
                double input19 = scan.nextDouble();
                System.out.println(Value.exp(input19));
                break;


            case "abs":
                System.out.println("Enter Value: ");
                double input20 = scan.nextDouble();
                System.out.println(Value.absoluteValue(input20));
                break;

            case "fact":
                System.out.println("Enter Value: ");
                double input21 = scan.nextDouble();
                System.out.println(Value.factorial(input21));
                break;
        }

    }
}