import java.util.Scanner;
class switchChallenge4{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int choice;
   do{
   System.out.println("Select Operation:");
   System.out.println("Addition(press 1): ");
   System.out.println("Subtraction(press 2) ");
   System.out.println("Multiplication(press 3) ");
   System.out.println("Division(press 4) ");
   System.out.println("Press 0 to Stop: ")
   choice = sc.nextInt();

   switch(choice){
      case 1:
        System.out.println("Enter number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter number: ");
        int n2 = sc.nextInt();
        System.out.println(n1 + n2);
        break;

      case 2:
        System.out.println("Enter number: ");
        int n3 = sc.nextInt();
        System.out.println("Enter number: ");
        int n4 = sc.nextInt();
        System.out.println(n3-n4);
        break;

      case 3:
        System.out.println("Enter Number: ");
        int n5 = sc.nextInt();
        System.out.println("Enter Number: ");
        int n6 = sc.nextInt();
        System.out.println(n5 * n6);
        break;

      case 4:
        System.out.println("Enter Number: ");
        double n7 = sc.nextDouble();
        System.out.println("Enter Number: ");
        double n8 = sc.nextDouble();
        System.out.println(n7 / n8);
        break;

      default:
        System.out.println("Invalid Operation");
        break;
  }
  }while(choice != 0);
 }
}