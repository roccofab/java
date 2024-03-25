import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Array {
    public int[] V;

    public Array(int n) {  //constructor method for the class Array that instantitate an array of casual numbers from 0 to 100
        V = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            V[i] = rand.nextInt(100);
        }
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < V.length; i++) {
            System.out.print(V[i]);
            if (i < V.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public int sum() {  //calculate sum of all numbers of array
        int sum = 0;
        for (int i = 0; i < V.length; i++) {
            sum += V[i];
        }
        return sum;
    }

    public double average() {   //calculate the average of the numbers stored
        return (double) sum() / V.length;
    }

    public int max() {   //calculate the maximum value stored in the array
        int max = V[0];
        for (int i = 0; i < V.length; i++) {
            if (V[i] > max) {
                max = V[i];
            }
        }
        return max;
    }

    public int min() {   //calculate the minimum value stored in the array
        int min = V[0];
        for (int i = 0; i < V.length; i++) {
            if (V[i] < min) {
                min = V[i];
            }
        }
        return min;
    }

    public double median() {   //sort array and then calculate the median value of it
        Arrays.sort(V);
        int mid = V.length / 2;
        if (V.length % 2 == 0) {
            return (V[mid - 1] + V[mid]) / 2.0;
        } else {
            return V[mid];
        }
    }

    public int mode() {  //method to calculate the mode value for the not sorted array
        int mode = V[0];
        int count = 1;
        for (int i = 1; i < V.length; i++) {
            if (V[i] == mode) {
                count++;
            } else {
                if (count > 1) {
                    return mode;
                } else {
                    mode = V[i];
                    count = 1;
                }
            }
        }
        return mode;
    }

    public int[] getIndex(int element) {  //method to get all occurences of a specific element within the array and return an array containing the indices of all occurrences
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < V.length; i++) {
            if (V[i] == element) {
                indexes.add(i);
            }
        }
        // Convert arrayList to integers array
        int[] result = new int[indexes.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = indexes.get(i);
        }
        return result;
    }

    public int getFrequency(int element) {   //count occurences of an element from input
        int count = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i] == element) {
                count++;
            }
        }
        return count;
    }

    public int evenNumbers() {   //count even numbers stored in the array
        int count = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int oddNumbers() {   //count odd numbers stored in the array
        int count = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int sumEvenNumbers() {   //sum of the even numbers stored in the array
        int sum = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i] % 2 != 0) {
                sum += V[i];
            }
        }
        return sum;
    }

    public int sumOddNumbers() {
        int sum = 0;
        for (int i = 0; i < V.length; i++) {   //sum of the odd numbers stored in the array
            if (V[i] % 2 != 0) {
                sum += V[i];
            }
        }
        return sum;
    }

    public int sumRange(int start, int end) {   //calculate sum of the numbers in a range: from index start to index end(included)
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += V[i];
        }
        return sum;
    }

    public String sort() {   //sort array using algorithm from library java.util.Array
        int[] sortedArray = V.clone();
        Arrays.sort(sortedArray);
        return Arrays.toString(sortedArray);
    }

    public static int[] reverse(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public int isGreaterThan(int element) {   //count how many numbers stored in the array are greater than a number from input
        int count = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i] > element) {
                count++;
            }
        }
        return count;
    }
}
