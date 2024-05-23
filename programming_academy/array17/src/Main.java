import java.util.Arrays;
public class Main {
    public static String[] RimuoviDuplicati(String[] array) {  //rimuovere gli elementi duplicati di un dato array e restituire la nuova lunghezza dell'array
        int index = 0;
        int duplicato = 0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i].equalsIgnoreCase(array[i+1])) {
                duplicato++;
            }
        }
        String[] array2 = new String[array.length - duplicato];
        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equalsIgnoreCase(array[i + 1])) {
                array2[index] = array[i];
                index++;
            }
        }
        if(duplicato == 0) {
            return array;
        }
        array2[index] = array[array.length - 1];
        System.out.println(array2.length);
        return array2;
    }
    public static void main(String[] args) {
        String[] array = {"hello", "java", "programming", "programming", "programming", "python", "python", "array"};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(RimuoviDuplicati(array)));
    }
}