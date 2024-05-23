import java.util.Scanner;
import java.util.*;
class LoopChallenge1{
 public static void main(String[] args){
  System.out.println("Print Tables:");
   for(int i = 1; i <= 10; i++){
     for(int j = 1; j <= 10; j++){
      System.out.print(j+ " ");
   }
    System.out.println();
  }
 System.out.println("\n");
   for(int i = 1; i <= 10; i++){
    for(int j = 1; j <= 10; j++){
     System.out.print(i+ " ");
   }
   System.out.println();
  }
 System.out.println("\n");
  
  for(int i = 1; i <= 10; i++){
   for(int j = i + 1; j < 10; j++){
     System.out.print(j+ " ");
   }
  System.out.println();
  }
 System.out.println("\n");
 
  for(int i = 1; i <= 10; i++){
   for(int j = 1; j <= 10; j++){
     System.out.print(i+j+ " ");
   }
  System.out.println();
  }
 System.out.println("\n");
  int count = 0;
  for(int i = 1; i <= 10; i++){
   for(int j = 1; j <= 10; j++){
    count++;
    System.out.format("%02d ", count);
   }
  System.out.println();
  }
  System.out.println("\n");
  
  for(int i = 1; i <= 10; i++){
   for(int j = 1; j < i; j++){
     System.out.print(j+ " ");
   }
  System.out.println();
  }
 System.out.println("\n");

  int counter = 0;  
  for(int i = 1; i <= 10; i++){
   for(int j = 1; j <= i; j++){
     counter++;
     System.out.print(counter+ " ");
   }
  System.out.println();
  }
 System.out.println("\n");

 }
}