//sorting string array
import java.util.*;
import java.util.Arrays;
class ArrayChallenge13{
 public static void main(String[] args){
  String[] arr = {"java","python", "javascript", "rust", "bash", "matlab", "php"};
  Arrays.sort(arr);
  for(String i : arr){
    System.out.print(i+ "  ");
  }
 }
}