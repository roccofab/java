import java.util.Scanner;
import java.util.*;
class LoopChallenge2{
 public static void main(String[] args){
  System.out.println("Print Triangle Tables:");
  for(int i = 1; i <= 5; i++){
   for(int j = 1; j <= 5-i+1; j++){
    System.out.print("*");
   }
  System.out.println();
  }
 System.out.println("\n");
  for(int i = 1; i <= 5; i++){
   for(int j = 1; j <= 5; j++){
     if(j >= i){
      System.out.print("*");
    } else{
     System.out.print(" ");
    }
   }
  System.out.println();
  }
 
  System.out.println("\n");
  for(int i = 10 - 2; i >= 1; i -= 2){
   for(int j = 0; j < (10 - i) / 2; j++){
     System.out.print(" ");
    }
    for(int k = 0; k < i; k++){
     System.out.print("*");
   }
  System.out.println();
 }
}
}