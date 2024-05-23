import java.util.Scanner;
public class ArrayChallenge14{
 public static void ZigZag(int[] array){
   for(int i = 0; i < array.length; i++){
    int j = array.length-i;
    System.out.print(i+ " ");
    System.out.print(j+ " ");
  }
 }
 public static void main(String[] args){
   int[] array = {1, 2, 3, 4, 5, 6, 7, 8,9, 10};
   ZigZag(array);
 }
}
