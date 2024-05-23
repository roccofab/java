//controlla se un anno è bisestile o non bisestile
import java.util.Scanner;
class ConditionalChallenge3{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Date: ");
   int date = sc.nextInt();
   if(date % 4 == 0 && date % 100 != 0 || (date % 400 == 0)){
    System.out.println("Leap Year");
  }else if(date % 100 == 0){
    System.out.println("Not a Leap Year");  
  }else{
    System.out.println("Not a Leap Year");
  }
 }
}