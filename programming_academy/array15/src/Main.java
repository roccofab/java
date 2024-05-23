//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean VerificaUguaglianza(int[] array1, int[] array2) {  // verificare l'uguaglianza di due array
        if (array1.length != array2.length) {
            return false;
        }
        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
        System.out.println(VerificaUguaglianza(array1, array2));
    }
}