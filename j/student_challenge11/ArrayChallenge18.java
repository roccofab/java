import java.util.Arrays;
import java.util.Scanner;
public class ArrayChallenge18{
 public static String[] removeOccurences(String[] arr, String str){
  int count = 0;
  Arrays.sort(arr);
  for(String i : arr){
   if(i.equalsIgnoreCase(str)){
    count++;
   }
  }
  String[] newArr = new String[arr.length - count];
  int index = 0;
  for(String i : arr){
    if(!i.equals(str)){
     newArr[index] = i;
     index++;
   }
  }
  return newArr;
 }
 public static void printArray(String[] arr){
  for(String i : arr){
    System.out.print(i+ "  ");
  }
 }
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String[] arr = {"hello", "word", "programming", "computer science", "gaming"};
  printArray(arr);
  System.out.println("Enter String to Remove: ");
  String str = sc.nextLine();
  String[] newArr = removeOccurences(arr, str);
  printArray(newArr); 
 }
}