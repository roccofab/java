// print number in words
import java.util.Scanner;
class LoopChallenge1 {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Number: ");
  int num = sc.nextInt();
  int r = 0;
  String str = "";
  while(num > 0){
    r = num % 10;
    num /= 10;
    str = str + r;
  }
   char c;
   for(int i = str.length() - 1; i >= 0; i--){
    c = str.charAt(i);
    switch(c) {
       case '0':
         System.out.println("zero");
         break;

       case '1':
         System.out.println("one");
         break;

       case '2':
         System.out.println("two");
         break;

       case '3':
         System.out.println("three");
         break;

       case '4':
         System.out.println("four");
         break;

       case '5':
         System.out.println("five");
         break;

       case '6':
         System.out.println("six");
         break;

       case '7':
         System.out.println("seven");
         break;

       case '8':
         System.out.println("eight");
         break;

       case '9':
         System.out.println("nine");
         break;
       
       default:
          System.out.println("not a number");
          break;
   }
  }
 }
}