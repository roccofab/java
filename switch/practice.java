import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     double num1;
     double num2;
     String word1;
     String word2;
     String symbol;
     String result;
     double addition;
     System.out.println("Choose string(s) or numbers(n): ");
      symbol = input.nextLine();

      switch(symbol) {
        case "s":
          System.out.println("Enter string: ");
          word1 = input.nextLine();

          System.out.println("Enter string: ");
          word2 = input.nextLine();
           
          result = word1 + word2;
          System.out.println(result);
         
          break;
        
        case "n":
          System.out.println("Enter number: ");
          num1 = input.nextInt();
          
          System.out.println("Enter number: ");
          num2 = input.nextInt();
          
          addition = num1 + num2;
          System.out.println(addition);
      }
    }
}