import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/* program that reads a list of integers from the user and throws an exception
   if any numbers are duplicates
 */

public class Main {
    public static ArrayList<Integer> createList(int size){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            list.add(sc.nextInt());
        }
        return list;
    }
    public static void hasDuplicated(ArrayList<Integer> list) throws DuplicateNumberException{
        Set<Integer> uniqueNums = new HashSet<Integer>();
        for(int num : list){
            try {
                if (uniqueNums.contains(num)) {
                    throw new DuplicateNumberException(num);
                }
                uniqueNums.add(num);
            } catch(DuplicateNumberException e){
                System.out.println(e.getMessage());
            }
        }
        printNoDuplicatedSet(uniqueNums);
    }
    public static void printNoDuplicatedSet(Set<Integer> uniqueNums){
        System.out.println("List with no Duplicates:");
        for(int num : uniqueNums){
            System.out.print(num+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try {
            ArrayList<Integer> list = createList(5);
            hasDuplicated(list);
        } catch(DuplicateNumberException e){
            System.out.println(e.getMessage());
        }
    }
}