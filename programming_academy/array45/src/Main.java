//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int[] Separa0e1(int[] array){
        int[] array2 = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                array2[i] = 0;
            } else {
                array2[i] = 1;
            }
        }
        return array2;
    }
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 0, 1, 1, 0, 1};
        int[] array2 = Separa0e1(array);
        for(int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+ " ");
        }
    }
}