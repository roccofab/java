//change a value of an array using the method Change and change the value of an integer type using the method Change2
import java.util.Scanner;
import java.util.*;
class MethodChallenge2{
 static void Change(int[] array, int index, int value){
   array[index] = value;
 }
 static int Change2(int x, int value){
   x = value;
   return x;
 }
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int[] array = {1,2,3,4,5,6,7,8,9,10};
   System.out.println("Enter Index and the New Value: ");
   int index = sc.nextInt();
   int value = sc.nextInt();
   Change(array, index, value);
   for(int i : array){   //print the new array
    System.out.print(i+ " ");
  }
  
  int x = 3000;
  System.out.println("\n" +x);
  System.out.println("Enter the new Value: ");
  int newValue = sc.nextInt();
  int j = Change2(x, newValue);
  System.out.println(j);
 }
}
