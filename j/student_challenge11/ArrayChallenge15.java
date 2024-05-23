import java.util.Scanner;
public class ArrayChallenge15{
 public static String evenOddSum(int[] array){
  int even = 0;
  int odd = 0;
  for(int i = 0; i < array.length; i+= 2){
    even += array[i];
    odd += array[i + 1];
  }
   if(even == odd){
    return "Sum is equal";
  } else return "Sum is different";
 }
 public static void main(String[] args){
  int[] array = {1, 10, 20, 2, 3, 4, 7, 9, 13, 17};
  String result = evenOddSum(array);
  System.out.println(result);
 }
}
