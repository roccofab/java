//find day's name based on number
import java.util.Scanner;

class ConditionalChallenge4{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   short day;
  do{
   System.out.println("Enter Number between 1 to 7(0 to stop): ");
   day = sc.nextShort();
   if(day == 1){
    System.out.println("Monday");
  } else if(day == 2){
    System.out.println("Tuesday");
  } else if(day == 3){
    System.out.println("Wednesday");
  } else if(day == 4){
    System.out.println("Thursday");
  } else if(day == 5){
    System.out.println("Friday");
  } else if(day == 6) {
    System.out.println("Saturday");
  } else if(day == 7){
    System.out.println("Sunday");
  }
 } while(day != 0);
 }
}