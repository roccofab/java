package arrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Array2 {
    public int[][] M;

    public Array2(int r, int c) {   //constructor for the class Array2 that istanciate a matrix of random values from 0 to 100
        M = new int[r][c];
        Random rand = new Random();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                M[i][j] = rand.nextInt(100);
            }
        }
    }

    public void printArray() {   //print matrix using two nested loops
        for (int i = 0; i < M.length; i++) {
            System.out.print("|");
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j]);
                if (j < M[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public int sum() {  //calculate sum of all values stored in the matrix
        int sum = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                sum += M[i][j];
            }
        }
        return sum;
    }

    public double average() {   //convert sum of all values in the matrix to double and calculate the average value
        return (double) sum() / M.length;
    }

    public int max() {   //get the max value stored in the matrix using two nested loops and comparation between values: this method is simple but it's not efficient enough on large matrices
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] > max) {
                    max = M[i][j];
                }
            }
        }
        return max;
    }

    public int maxStreamApi() {   //get the max value using Stream API for java version 8 or later:  Stream API is more efficient than nested loops
        int max = Arrays.stream(M)
                .flatMapToInt(IntStream::of)
                .max()
                .getAsInt();
        return max;
    }

    public int[][] searchElement(int element) {   //search for position or positions of an input number: if the position is right then return new matrix(n x 2): any row contain row and column index for the element found this will print all the positions of the input element found in the matrix M
        List<int[]> positionsList = new ArrayList<>();
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == element) {
                    positionsList.add(new int[]{i, j});
                }
            }
        }
        int[][] positions = new int[positionsList.size()][2];
        for (int k = 0; k < positionsList.size(); k++) {
            positions[k] = positionsList.get(k);
        }
        return positions;
    }
    public int[][] transposedMatrix() {   //create a new matrix transposed from the matrix M changing rows and columns
        int row = M.length;
        int column = M[0].length;
        int[][] transposed = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposed[j][i] = M[i][j];
            }
        }
        return transposed;
    }
    public int[][] diagonalMatrix() {   //create a new diagonal matrix from the matrix M: the diagonal matrix is a matrix with elements on the main diagonal non-zero and all the others equal to 0
        int row = M.length;
        int column = M[0].length;
        int[][] diagonal = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {   //if the row index is equal to the column index it is on the main diagonal
                    diagonal[i][j] = M[i][j];
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }
        return diagonal;
    }

    public int[][] multiplyByScalar(int element) {   //get a new matrix by multiplication between matrix M and a scalar
        int row = M.length;
        int column = M[0].length;
        int[][] multiplied = new int[row][column];
        for(int i = 0; i <row; i++) {
            for(int j = 0; j < column; j++) {
                multiplied[i][j] = M[i][j] * element;
            }
        }
        return multiplied;
    }

    public int[][] multiplyMatrices(int[][] M1, int[][] M2) {   //get a new matrix multipliedM by multiplication of M1 rows and M2 columns
        int rowM1 = M1.length;
        int columnM1 = M1[0].length;
        int rowM2 = M2.length;
        int columnM2 = M2[0].length;
        if(rowM1 != columnM2) {   //matrix M1 and matrix M2 must have the same number rows and columns else throw exception
            throw new IllegalArgumentException("Matrices must have the same number of rows and columns");
        }
        int[][] multipliedM = new int[rowM1][columnM2];
        for(int i = 0; i < rowM1; i++) {
            for(int j = 0; j < columnM1; j++) {
                for(int k = 0; k < columnM2; k++) {
                    multipliedM[i][k] += M1[i][k] * M2[k][j];  //multiplication of M1 rows by M2 columns
                }
            }
        }
        return multipliedM;
    }
    public int[][] addMatrices(int[][] M1, int[][] M2) {  //Addition of two matrices: this method look like to multipliMatrices method but the corresponding elements of the matrices are added not multiplied
        int rowM1 = M1.length;
        int columnM1 = M1[0].length;
        int rowM2 = M2.length;
        int columnM2 = M2[0].length;
        if(rowM1!= rowM2 || columnM1!= columnM2) {   //matrix M1 and matrix M2 must have the same number rows and columns else throw exception
            throw new IllegalArgumentException("Matrices must have the same number of rows and columns");
        }
        int[][] addedM = new int[rowM1][columnM2];
        for(int i = 0; i < rowM1; i++) {
            for(int j = 0; j < columnM1; j++) {
                for(int k = 0; k < columnM2; k++) {
                    addedM[i][k] = M1[i][k] + M2[i][k];   //the elements on the row are added to elements on the columns
                }
            }
        }
        return addedM;
    }
}
