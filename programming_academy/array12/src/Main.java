import java.util.ArrayList;
public class Main {
    public static ArrayList<Integer> ArrayToArrayList(int[] array) {  //convertire un array in ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i : array) {
            arrayList.add(i);
        }
        return arrayList;
    }
    public static void main(String[] args) {
        int[] array = {1, 10, 50, 100, 200, 300};
        ArrayList<Integer> arrayList = ArrayToArrayList(array);
        for(int i : arrayList) {
            System.out.print(i+ " ");
        }
    }
}