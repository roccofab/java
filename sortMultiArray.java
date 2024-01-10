import java.util.Scanner;
import java.util.Random;
public class sortMultiArray {
   public static int[][] randomArray(int row, int col) {
        int[][] multiArray = new int[row][col];
        Random rand = new Random();

        for (int i = 0; i < row; i++) {
            for (int l = 0; l < col; l++) {
                multiArray[i][l] = rand.nextInt(100);
            }
        }

        return multiArray;
    }
    public static int[][] printMultiArray(int [][] multiArray) {
         for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
        return multiArray;
    }
  public static int[][] sortBubble(int[][] array2d) {
    for (int i = 0; i < array2d.length; i++) {
        for (int j = 0; j < array2d[i].length - 1; j++) {
            for (int k = 0; k < array2d.length; k++) {
                for (int l = 0; l < array2d[k].length - 1; l++) {
                    if (array2d[k][l] > array2d[k][l + 1]) {
                        int temp = array2d[k][l];
                        array2d[k][l] = array2d[k][l + 1];
                        array2d[k][l + 1] = temp;
                    }
                }
            }
        }
    }
    return array2d;
}

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           System.out.println("enter number rows: ");
           int row = input.nextInt();
           System.out.println("enter number columns: ");
           int col = input.nextInt();

           int [][] arrayGenerated = randomArray(row, col);
           int [][] multiArray = printMultiArray(arrayGenerated);


           int[][] sorted2dArray = sortBubble(arrayGenerated);
           System.out.println("\n\nSorted array:");
           printMultiArray(sorted2dArray);
        }
}