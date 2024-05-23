import java.util.Scanner;
import java.util.*;
class ArrayChallenge1{
 public static void main(String[] args){
  int[] nums = {1, 2, 10, 20, 30, 40, 50, 60};
  int sum = 0;
  for(int i = 0; i < nums.length; i++){
    sum += nums[i];
  }
  System.out.println("The sum is: " +sum); 
 }
}