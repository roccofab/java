import java.util.Scanner;
class ConditionalChallenge2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    String n1ToString = sc.nextLine();
  
    if(n1ToString.matches("[0-1]*")){
      System.out.println("Binary Number");
    } else if(n1ToString.matches("[0-7]*")) {
      System.out.println("Ottal Number");
    } else if(n1ToString.matches("[0-9A-F]*")) {
      System.out.println("Exadecimal Number");
    } else if(n1ToString.matches("[0-9]+")){
      System.out.println("Decimal Number");
    }
     
  }
}