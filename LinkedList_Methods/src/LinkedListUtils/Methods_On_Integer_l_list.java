package LinkedListUtils;
import java.util.*;

public class Methods_On_Integer_l_list {
    public LinkedList<Integer> addInteger(int num){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(num);
        return list;
    }
    public void Iterate_l_list(LinkedList<Integer> l_list){
        for(Integer num : l_list){
            System.out.println(num);
        }
    }
    public void Iterate_from_index(LinkedList<Integer> l_list, int index){
        Iterator p = l_list.listIterator(index);
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
    public void Reverse_l_list(LinkedList<Integer> l_list){
        Iterator p = l_list.descendingIterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
    public void insertElement(LinkedList<Integer> l_list, int index, int num){
        l_list.add(index, num);
        System.out.println(l_list);
    }
    public void FirstLastPos(LinkedList<Integer> l_list, int n1, int n2){
        System.out.println("Original Linked List: " +l_list);
        l_list.addFirst(n1);
        l_list.addLast(n2);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void RemoveElement(LinkedList<Integer> l_list, int index){
        System.out.println("Original Linked List: " +l_list);
        l_list.remove(index);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void RemoveAll(LinkedList<Integer> l_list){
        System.out.println("Original Linked List: " +l_list);
        l_list.clear();
        System.out.println("Modified Linked List: " +l_list);
    }
    public void swapTwo_int(LinkedList<Integer> l_list, int index1, int index2){
        System.out.println("Original Linked List: " +l_list);
        Collections.swap(l_list, index1, index2);  //swap the element at index1 with the element at index2
        System.out.println("Modified Linked List: " +l_list);
    }
    public void shuffleElements_int(LinkedList<Integer> l_list){
        System.out.println("Original Linked List: " +l_list);
        Collections.shuffle(l_list);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void link_two_l_list(LinkedList<Integer> l_list1, LinkedList<Integer> l_list2){
        LinkedList<Integer> l_list3 = new LinkedList<Integer>();
        System.out.println("Original Linked List: " +l_list1);
        l_list3.addAll(l_list1);
        l_list3.addAll(l_list2);
        System.out.println("Result: " +l_list3);
    }
    public void copy(LinkedList<Integer> l_list){
        LinkedList<Integer> l_list2 = new LinkedList<Integer>();
        System.out.println("Original Linked List: " +l_list);
        l_list2 = new LinkedList<>(l_list);
    }
    public void getElement(LinkedList<Integer> l_list, int index){
        System.out.println(l_list.get(index));
    }
    public void toList(LinkedList<Integer> l_list){
        List<Integer> list = new ArrayList<Integer>(l_list);
    }
    public ArrayList<String> Compare(LinkedList<Integer> l_list, LinkedList<Integer> l_list2){
        ArrayList<String> list = new ArrayList<String>();
        for(int l : l_list){
            list.add(l_list2.contains(l) ? "yes" : "no");
        }
        return list;
    }
    public boolean isEmpty(LinkedList<Integer> l_list){
        return l_list.isEmpty();
    }
    public void set_new(LinkedList<Integer> l_list, int num, int index){
        l_list.set(index, num);
        System.out.println(l_list);
    }
}
