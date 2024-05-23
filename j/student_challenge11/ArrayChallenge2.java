//print array and find position of an element from input
import java.util.Scanner;
import java.util.*;
class ArrayChallenge2{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  for(int i = 0; i < nums.length; i++){
   System.out.print(nums[i]);
   if(i < nums.length-1){
    System.out.print(",");
  }
 }
 System.out.println("\nEnter Number Stored in array: ");
 int n = sc.nextInt();
 int temp = nums[0];
 for(int i = 0; i < nums.length; i++){
   if(nums[i] == n){
    temp = i;
  }
 }
System.out.println("Position: " +temp);
}
}