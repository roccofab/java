import java.util.Scanner;
public class Conditional4{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  boolean found = false;
  int num = sc.nextInt();
  while(num!= 0){
   int prev = num;
   num = sc.nextInt();
   if(prev > 0 && num < 0){
    found = true;
   } 
  }
   if(found){
    System.out.println("The previous input number is less than zero");
  } else{
   System.out.println("no");
  }
 }
}