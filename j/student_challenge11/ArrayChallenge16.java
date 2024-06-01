import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class ArrayChallenge16{
 public static BigInteger FactorialIterative(int num){
  BigInteger factorial = BigInteger.ONE;;
  for(int i = 1; i <= num; i++){
   factorial = factorial.multiply(BigInteger.valueOf(i));
  }
  return factorial;
 }
 public static void greatestSmallerSearch(int[] arr){
  int greatest = Integer.MIN_VALUE;
  int smaller = Integer.MAX_VALUE;
  for(int i = 0; i < arr.length; i++){
    if(arr[i] > greatest){
     greatest = arr[i];
   }
    if(arr[i] < smaller){
     smaller = arr[i];
   }
  }
   System.out.println("The greatest Value is: " +greatest);
   System.out.println("The smallest Value is: " +smaller);
 }
 public static int[] createArray(int l){
  Scanner sc = new Scanner(System.in);
  int[] arr = new int[l];
  for(int i = 0; i < l; i++){
    System.out.println("Enter Value: ");
    int value = sc.nextInt();
    arr[i] = value;
  }
  return arr;
 }
 public static void printArray(int[] arr){
  for(int i = 0; i < arr.length; i++){
   System.out.println(arr[i]);
  }
 }
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the length of the array to create: ");
  int l = sc.nextInt();
  int[] arr = createArray(l);
  printArray(arr);
  greatestSmallerSearch(arr);
  System.out.println("Enter Value: ");
  int num = sc.nextInt();
  BigInteger fact = FactorialIterative(num);
  System.out.println("The factorial of " +num+ " is: " +fact);
 }
}