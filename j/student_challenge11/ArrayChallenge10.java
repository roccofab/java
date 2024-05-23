import java.util.*;
import java.util.Arrays;
class ArrayChallenge10{
 public static void main(String[] args){
    int[][] matrix = {{1,2,3,4},

                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}
                      };
  for(int[] i : matrix){  //method 1 to print matrix using for each
   for(int j : i){
     System.out.format("%2d ", j);
   }
System.out.println();
  }
  System.out.println("\n");

  for(int i = 0; i < matrix.length; i++){  //method 2 to print matrix 
   for(int j = 0; j < matrix[0].length; j++){
     System.out.format("%2d ", matrix[i][j]);
   }
  System.out.println();
  }
 System.out.println("\n");


//create and print a jagged matrix
  int[][] matrix2;
  matrix2 = new int[3][];
  matrix2[0] = new int[2];  //row 1 contain 2 columns
  matrix2[1] = new int[4];  //row 2 contain 2 columns
  matrix2[2] = new int[3];  //row 3 contain 3 columns
  for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = (i + 1) * (j + 1); // assign casual values to the jagged matrix
            }
        }
  for(int[] i : matrix2){
   for(int j : i){    //print jagged matrix
    System.out.format("%2d ", j);
   }
System.out.println();
  }
 }
}

