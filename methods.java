import java.util.Scanner;

public class methods {
    public static double max(double x, double y, double z) {
        return  x + y + z;
    }
    public static int maxValue(int [] ar) {
        if(ar.length==0) {
            System.out.println("error");
            return -1;
        } else {
            int smallestValue = ar[0];

            for(int j : ar) {
                if(j > smallestValue) {
                  smallestValue = j;
                }
            }  
            return smallestValue;   
        }
    }
    public static int printer( int [] array) {
        int i;
        for( i = 0;i < array.length; i++) {
          System.out.print(array[i]+ ",");
        }
        return i;
    }
    public static int pow(int a, int b) {
        double resultFloating = Math.pow(a, b);
        int result = (int) resultFloating;
        return result;
    }

    public static int counterDigits(int number) {
        int count = 0;
        while(number != 0) {
            if(number == 0) {
            System.out.println("enter value > 0");
        }
            number = number/10;
            count++;
        }
        return count;
    }

    public static double rectangleArea(double base, double height ) {
        return base * height;
    }

    public static double rightTriangleArea(double base, double height) {
        return(base*height)/2;
    }
    public static double quadrateArea(double side){
        return side * side;
    }
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    public static double trapeziusArea(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;    
    }
    public static double hexagonArea(double l) {
        return (3* Math.sqrt(3)/2) * Math.pow(l, 2);
    }
    public static int [] evenOddCounter(int [] array2) {
        int counterEven = 0;
        int counterOdd = 0;
        for(int c : array2) {
            if(c%2 == 0) {
              counterEven++;
            } else {
                counterOdd++;
            }
        }
        int [] result = {counterEven, counterOdd};
        return result;        
   }
   public static boolean isPalindrome(String parola) {
    String parolaInvertita = new StringBuilder(parola).reverse().toString();
    System.out.println("Parola al contrario: " + parolaInvertita);
    return parola.equalsIgnoreCase(parolaInvertita);
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter value: ");
        double x = input.nextDouble();
        System.out.println("enter value: ");
        double y = input.nextDouble();
        System.out.println("enter value: ");
        double z = input.nextDouble();
    
    
    //addition of three numbers using the method max
        double result = max(x, y, z);
        System.out.println(result);
      
        int [] elements = {1, 2, 0, 3, 10, 100, 200, 5, 4, 2, 1000};

    
    
    //Printing numbers stored in the array elements [] using the method printer(int[] array)
        int display = printer(elements);
    
    
    
    
    //Printing the max value of the array elements [] using the method maxValue
        int maxNum = maxValue(elements);
        System.out.println("\nThe maximum value is: " +maxNum);


    
    //printing pow 
      System.out.println("enter base: ");
      int a =input.nextInt();
      System.out.println("enter exponent: ");
      int b = input.nextInt();
      int num = pow(a, b);
      System.out.println(num);
      
    
    
    //count the number digits of an integer not 0  
      System.out.println("enter number: ");
      int numberToCount = input.nextInt();
      while(numberToCount == 0) {
        System.out.println("enter number: ");
        numberToCount = input.nextInt();
      }
      int numberDigits = counterDigits(numberToCount);
      System.out.println(numberDigits+ " digits");

    
    
      /*calculate area of rectangle(1) using the method rectangleArea(double base, double height), calculate right triangle area(2) using
    the method rightTriangleArea(double base, double height), calculate area of quadrate(3) using the method quadrateArea(double side),
    calculate circle area(4) using the method circleArea(double radius), calculate trapezius area(5) using the method trapeziusArea(double base1, double base2, double height),
    calculate hexagon area(6) using the method hexagonArea(double l)*/  
      System.out.println("Calculate Area!");
      System.out.println("Select option (1-rectangle area), (2-right triangle area), (3-quadrate area), (4-circle area), (5-trapezius area), (6-hexagon area): ");
      int options = input.nextInt();
      switch(options) {
        case 1:
        System.out.println("enter base: ");
        double base = input.nextDouble();
        System.out.println("enter height: ");
        double height = input.nextDouble();
        double area = rectangleArea(base, height);
        System.out.println("The area is: " +area);
        break;

        case 2:
        System.out.println("enter base: ");
        double baseRT = input.nextDouble();
        System.out.println("enter height: ");
        double heightRT = input.nextDouble();
        double areaRT = rightTriangleArea(baseRT, heightRT);
        System.out.println("The area is: " +areaRT);
        break;
        
        case 3:
        System.out.println("enter the side of the quadrate: ");
        double sideQ = input.nextDouble();
        double areaQ = quadrateArea(sideQ);
        System.out.println("The area is: " +areaQ);
        break;

        case 4:
        System.out.println("enter the radius of the circle: ");
        double radiusC = input.nextDouble();
        double areaC = circleArea(radiusC);
        System.out.println("The area is: " +areaC);
        break;

        case 5:
        System.out.println("enter base1: ");
        double baseT1 = input.nextDouble();
        System.out.println("enter base2: ");
        double baseT2 = input.nextDouble();
        System.out.println("enter height: ");
        double heightT = input.nextDouble();
        double areaT = trapeziusArea(baseT1, baseT2, heightT);
        System.out.println("The area is: " +areaT);
        break;

        case 6:
        System.out.println("enter side: ");
        double sideH = input.nextDouble();
        double areaH = hexagonArea(sideH);
        System.out.println("The area is: " +areaH);
        break;
      }


    
    /*print the numbers stored in the array evenOddNums[] using the method printer(int [] array) and count the even and odd numbers stored
     in the array evenOddNums[] using the method evenOddCounter(int [] array2)
     */
      int [] evenOddNums = {1, 1, 3, 5, 4, 2, 10, 6, 20, 30, 100, 131, 1000};
      int display2 = printer(evenOddNums);
      int [] countMetod = evenOddCounter(evenOddNums);
      System.out.print(display2);
      System.out.println("\nThe even numbers stored: " +countMetod[0]);
      System.out.println("The odd numbers stored: " +countMetod[1]);


    
    //enter a word and print the reverse word: if the input is a palindrome string you get true else you get false(it's not palindrome string)
      System.out.println("Enter word to see if it's palindrome: ");

      input.nextLine();

      String wordPalindrome = input.nextLine();

      boolean palindromeCheck = isPalindrome(wordPalindrome);
      System.out.println(palindromeCheck);

      input.close();
    }
}