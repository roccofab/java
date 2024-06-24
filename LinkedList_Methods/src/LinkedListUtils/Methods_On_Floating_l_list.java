package LinkedListUtils;
import java.util.*;

public class Methods_On_Floating_l_list {
    public LinkedList<Double> addDouble(double num){
        LinkedList<Double> list = new LinkedList<>();
        list.add(num);
        return list;
    }
    public LinkedList<Float> addFloat(float num){
        LinkedList<Float> list = new LinkedList<>();
        list.add(num);
        return list;
    }
    public void Iterate_Double_l_list(LinkedList<Double> l_list){
        for(Double num : l_list){
            System.out.println(num);
        }
    }
    public void Iterate_Float_l_list(LinkedList<Float> l_list){
        for(Float num : l_list){
            System.out.println(num);
        }
    }
    public void Iterate_from_index(LinkedList<Double> l_list, int index){
        Iterator p = l_list.listIterator(index);
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
    public void Iterate_from_index_Float(LinkedList<Float> l_list, int index){
        Iterator p = l_list.listIterator(index);
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
    public void Reverse_floating_l_list(LinkedList<Double> l_list){
        Iterator p = l_list.descendingIterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
    public void Reverse_floating_l_list_Float(LinkedList<Float> l_list){
        Iterator p = l_list.descendingIterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
    public void insertElement_double(LinkedList<Double> l_list, int index, double num){
        l_list.add(index,num);
        System.out.println(l_list);
    }
    public void insertElement_float(LinkedList<Float> l_list, int index, float num){
        l_list.add(index,num);
        System.out.println(l_list);
    }
    public void FirstLastPos_double(LinkedList<Double> l_list, double n1, double n2){
        System.out.println("Original Linked List: " +l_list);
        l_list.addFirst(n1);
        l_list.addLast(n2);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void FirstLastPos_float(LinkedList<Float> l_list, float n1, float n2){
        System.out.println("Original Linked List: " +l_list);
        l_list.addFirst(n1);
        l_list.addLast(n2);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void RemoveElement_double(LinkedList<Double> l_list, int index){
        System.out.println("Original Linked List: " +l_list);
        l_list.remove(index);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void RemoveElement_float(LinkedList<Double> l_list, int index){
        System.out.println("Original Linked List: " +l_list);
        l_list.remove(index);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void RemoveAll_double(LinkedList<Double> l_list){
        System.out.println("Original Linked List: " +l_list);
        l_list.clear();
        System.out.println("Modified Linked List: " +l_list);
    }
    public void RemoveAll_float(LinkedList<Float> l_list){
        System.out.println("Original Linked List: " +l_list);
        l_list.clear();
        System.out.println("Modified Linked List: " +l_list);
    }
    public void swapTwo_double(LinkedList<Double> l_list, int index1, int index2){
        System.out.println("Original Linked List: " +l_list);
        Collections.swap(l_list, index1, index2);  //swap the element at index1 with the element at index2
        System.out.println("Modified Linked List: " +l_list);
    }
    public void swapTwo_float(LinkedList<Float> l_list, int index1, int index2){
        System.out.println("Original Linked List: " +l_list);
        Collections.swap(l_list, index1, index2);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void shuffleElements_double(LinkedList<Double> l_list){
        System.out.println("Original Linked List: " +l_list);
        Collections.shuffle(l_list);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void shuffleElements_float(LinkedList<Float> l_list){
        System.out.println("Original Linked List: " +l_list);
        Collections.shuffle(l_list);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void link_two_l_list_double(LinkedList<Double> l_list1, LinkedList<Double> l_list2){
        LinkedList<Double> l_list3 = new LinkedList<Double>();
        System.out.println("Original Linked List: " +l_list1);
        l_list3.addAll(l_list1);
        l_list3.addAll(l_list2);
        System.out.println("Result: " +l_list3);
    }
    public void link_two_l_list_float(LinkedList<Float> l_list1, LinkedList<Float> l_list2){
        LinkedList<Float> l_list3 = new LinkedList<Float>();
        System.out.println("Original Linked List: " +l_list1);
        l_list3.addAll(l_list1);
        l_list3.addAll(l_list2);
        System.out.println("Result: " +l_list3);
    }
    public void copy_double(LinkedList<Double> l_list){
        LinkedList<Double> l_list2 = new LinkedList<Double>();
        System.out.println("Original Linked List: " +l_list);
        l_list2 = new LinkedList<>(l_list);
    }
    public void copy_float(LinkedList<Float> l_list){
        LinkedList<Float> l_list2 = new LinkedList<Float>();
        System.out.println("Original Linked List: " +l_list);
        l_list2 = new LinkedList<>(l_list);
    }
    public void getElement_double(LinkedList<Double> l_list, int index){
        System.out.println(l_list.get(index));
    }
    public void getElement_float(LinkedList<Float> l_list, int index){
        System.out.println(l_list.get(index));
    }

    public void toList_double(LinkedList<Double> l_list){
        List<Double> list = new ArrayList<Double>(l_list);
    }

    public void toList_float(LinkedList<Float> l_list){
        List<Float> list = new ArrayList<Float>(l_list);
    }
    public ArrayList<String> Compare_double(LinkedList<Double> l_list, LinkedList<Double> l_list2){
        ArrayList<String> list = new ArrayList<String>();
        for(double l : l_list){
            list.add(l_list2.contains(l) ? "yes" : "no");
        }
        return list;
    }
    public ArrayList<String> Compare_float(LinkedList<Float> l_list, LinkedList<Float> l_list2){
        ArrayList<String> list = new ArrayList<String>();
        for(float l : l_list){
            list.add(l_list2.contains(l) ? "yes" : "no");
        }
        return list;
    }
    public boolean isEmpty_double(LinkedList<Double> l_list){
        return l_list.isEmpty();
    }
    public boolean isEmpty_float(LinkedList<Float> l_list){
        return l_list.isEmpty();
    }
    public void set_new_double(LinkedList<Double> l_list, double num, int index){
        l_list.set(index, num);
        System.out.println(l_list);
    }
    public void set_new_float(LinkedList<Float> l_list, float num, int index){
        l_list.set(index, num);
        System.out.println(l_list);
    }
}
