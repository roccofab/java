//print array and find the maximum value stored in it
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
class ArrayChallenge3{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int[] nums = {-1, 2, 3, -4, 5, 16, 7, 28, 9, 10};
  int max = Integer.MIN_VALUE;
  for(int i = 0; i < nums.length; i++){
   System.out.print(nums[i]);
   if(i < nums.length-1){
    System.out.print(",");
  }
  if(nums[i] > max){
    max = nums[i];
  }
 }
 System.out.println("\nThe max Value is: " +max);
}
}