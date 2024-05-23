//multiplying two matrices 3x3
import java.util.*;
import java.util.Arrays;
class ArrayChallenge12{
 public static void main(String[] args){
  int[][] matrix1 = {{3,5,9},{7,6,2}, {4,3,5}};
  int[][] matrix2 = {{1,0,0}, {0,1,0}, {0,0,1}};
  int[][] result = new int[matrix1.length][matrix2[0].length];
  for(int i = 0; i < matrix1.length;i++){
    for(int j = 0; j < matrix2[0].length;j++){
      result[i][j] = 0;
     for(int k = 0; k < matrix1[0].length; k++){
      result[i][j] += matrix1[i][k] * matrix2[k][j];
   }
  }
 }
   for(int[] i : result){  //print matrix result
       for(int j : i){
         System.out.format("%2d ", j);
    }
    System.out.println();
  }

}
}
