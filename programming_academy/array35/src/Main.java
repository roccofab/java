import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static String[] ElementiComuni(String[] array1, String[] array2) {
        String[] array1SenzaDuplicati = (String[]) Arrays.stream(array1).distinct().toArray(String[]::new);  //elimina duplicati in array1 usando il metodo toArray di Stream e specificando il tipo di array di destinazion(String[]::new)
        String[] array2SenzaDuplicati = (String[]) Arrays.stream(array2).distinct().toArray(String[]::new);  //elimina duplicati in array2 usando il metodo toArray di Stream e specificando il tipo di array di destinazion(String[]::new)
        ArrayList<String> elementiComuni = new ArrayList<String>();
        for(String i : array1SenzaDuplicati) {
            for(String j : array2SenzaDuplicati) {
                if(i.equals(j)) {
                    elementiComuni.add(i);
                }
            }
        }
        return elementiComuni.toArray(new String[elementiComuni.size()]);  //restituisce l'ArrayList convertito in array
    }
    public static void main(String[] args) {
        String[] array1 = {"ciao", "ciao", "ciao", "scuola", "università", "scuola", "calcio", "calcio"};
        String[] array2 = {"ciao", "scuola", "università", "università"};
        String[] elementiComuni = ElementiComuni(array1, array2);
        System.out.println(Arrays.toString(elementiComuni));
    }
}