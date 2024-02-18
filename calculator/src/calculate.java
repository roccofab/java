import java.lang.Math;
public class calculate {
    public double addition(double a, double b) {
        return a + b;
    }
    public double subtraction(double a, double b) {
        return a - b;
    }
    public double multiplication(double a, double b) {
        return a * b;
    }
    public double division(double a, double b) {
        return a / b;
    }
    public double rest(double a, double b) {
        return a % b;
    }
    public double power(double a, double b) {
        return Math.pow(a, b);
    }
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
    public double cbrt(double a) {
        return Math.cbrt(a);  //this method calculate the cube root of a number
    }
    public double sin(double a) {
        return Math.sin(a);
    }
    public double cos(double a) {
        return Math.cos(a);
    }
    public double tan(double a) {
        return Math.tan(a);
    }
    public double log(double a) {
        return Math.log(a);
    }
    public double log10(double a) {
        return Math.log10(a);
    }
    public double exp(double a) {
        return Math.exp(a);
    }
    public double absoluteValue(double a) {
        return Math.abs(a);
    }
    public double roundDecimal(double a) {   //this method make a traditional round of decimal numbers(for example: 10.4 return 10.0)
        return Math.round(a);
    }
    public double floorDecimal(double a) {
        return (int) Math.floor(a);  //this method make a rounds down, returns the smallest integer value that is less than or equal to the specified number(for example 10.9 return 10.0)
    }
    public double ceilDecimal(double a) {
        return Math.ceil(a);  //this method make a rounds up, return the largest value that is greater than or equal to the specified number(for example 10.1 return 11.0)
    }
    public double factorial(double n) {   //this method calculate the factorial of number using the iterative approach
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of a negative number can't be defined");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public double factorialRecursive(double n) {   //this method is based on recursive call to calculate the factorial of a number, howewer you need to be careful to overflow so don't enter too large values for n
        if(n < 0) {
            throw new IllegalArgumentException("Factorial of a negative number can't be defined");
        }
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    public double calculateNroot(double a, double b) {    //calculate the Nth root of a number
        if (b == 0) {
            throw new IllegalArgumentException("Cannot calculate the 0th root");
        }

        if (a < 0 && b % 2 == 0) {
            throw new IllegalArgumentException("Cannot calculate the even root of a negative number");
        }
        return Math.pow(Math.abs(a), 1.0 / b) * Math.signum(a);
    }
}
