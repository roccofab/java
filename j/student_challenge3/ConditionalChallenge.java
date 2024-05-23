import java.util.Scanner;
class ConditionalChallenge{
  public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter number: ");
   int num = scan.nextInt();
   if(num % 2 == 0){
    System.out.println("Even Number");
   } else{
    System.out.println("Odd Number");
   }

   System.out.println("Enter Age: ");
   int age = scan.nextInt();
   if(age > 14 && age < 40){
    System.out.println("Young Person");
  } else if(age > 40 && age < 80){
   System.out.println("Middle Age");
  } else{
    System.out.println("Old");
  }
 }
}