//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] DisponiElementi(int[] array) {  //disponi i numeri < 0 a sinistra dell'array e i numeri > 0 a destra dell'array
        int[] array2 = new int[array.length];
        int index1 = 0;
        int index2 = array.length-1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array2[index1] = array[i];
                index1++;
            } else {
                array2[index2] = array[i];
                index2--;
            }
        }
            return array2;
        }
        public static void main (String[]args){
          int[] array = {1, 2, 10, -10, -1, -3, 30, 20};
          int[] array2 = DisponiElementi(array);
          for (int i = 0; i < array2.length; i++) {
              System.out.print(array2[i]+ " ");
          }
        }
    }