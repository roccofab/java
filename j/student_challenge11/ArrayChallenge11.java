//add two matrices 4x4
import java.util.*;
import java.util.Arrays;
class ArrayChallenge11{
 public static void main(String[] args){
   int[][] matrix1 = {{1,2,3,4},{10,20,30,40},{50,60,70,80},{90,100,110,120}};
   int[][] matrix2 = {{-10,-20,-30,-40},{-40, -50, -60,-70},{100,120,140,160},{200, 220,240,260}};
   int rows = matrix1.length;
   int columns = matrix1[0].length;
   int[][] result = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
     for(int[] i : result){
       for(int j : i){
         System.out.format("%2d ", j);
    }
    System.out.println();
  }
 }
}
