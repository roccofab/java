//copying an array into another array and then reverse it
import java.util.*;
import java.util.Arrays;
class ArrayChallenge9{
 public static void main(String[] args){
   int[] nums = {1,2,3,4,5,6,7,8,9,10};
   int[] copy = new int[10];
System.out.println("Original Array:");
   for(int i = 0; i < nums.length; i++){
    copy[i] = nums[i];
  }
   for(int i = 0; i < nums.length; i++){  //print copy array
    System.out.print(nums[i]+ " ");
  }

System.out.println("\nCopy Array:");
   for(int i = 0; i < copy.length; i++){  //print copy array
    System.out.print(copy[i]+ " ");
  }
System.out.println("\nReversed Array Copy:");  //reverse copy array
   for(int i = copy.length-1; i >= 0; i--){
    System.out.print(copy[i]+ " ");
  }
 }
}