import java.util.Scanner;
class switchChallenge2{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Name of a Month: ");
  String month = sc.nextLine();
  switch(month){
     case "september":
       System.out.println("09");
       break;

     case "october":
       System.out.println("10");
       break;

     case "november":
       System.out.println("11");
       break;

     case "december":
       System.out.println("12");
       break;

    case "january":
      System.out.println("01");
      break;

    case "february":
      System.out.println("02");
      break;

    case "march":
      System.out.println("03");
      break;

    case "april":
      System.out.println("04");
      break;

    case "may":
      System.out.println("05");
      break;

    case "june":
      System.out.println("06");
      break;

    case "july":
      System.out.println("07");
      break;

    case "august":
      System.out.println("08");
      break;

    default:
       System.out.println("Invalid Month");
       break;
  }
 }
}