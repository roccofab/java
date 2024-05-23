import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static ArrayList<String> ArrayToArrayList(String[] array) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            result.add(array[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        String[] array = {"hello", "football", "gym", "food", "school"};
        ArrayList<String> arrayList = ArrayToArrayList(array);
        System.out.println(Arrays.toString(array));
    }
}