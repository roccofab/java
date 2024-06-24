package LinkedListUtils;
import java.util.*;

public class Methods_On_str_l_list {
    public LinkedList<String> addString(String str){
        LinkedList<String> list = new LinkedList<>();
        list.add(str);
        return list;
    }
    public LinkedList<Character> addCharacter(char ch){
        LinkedList<Character> list = new LinkedList<>();
        list.add(ch);
        return list;
    }
    public void Iterate_Str_l_List(LinkedList<String> l_list){
        for(String str : l_list){
            System.out.println(str);
        }
    }
    public void Iterate_Character_l_list(LinkedList<Character> l_list){
        for(Character ch : l_list){
            System.out.println(ch);
        }
    }
    public void Iterate_from_index(LinkedList<String> l_list, int index){
        Iterator p = l_list.listIterator(index);
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
    public void Iterate_from_index_Character(LinkedList<String> l_list, int index){
        Iterator p = l_list.listIterator(index);
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
    public void Reverse_str_l_list(LinkedList<String> l_list){
        Iterator p = l_list.descendingIterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
    public void insertElement_String(LinkedList<String> l_list, int index, String str){
        l_list.add(index, str);
        System.out.println(l_list);
    }
    public void FirstLastPos_str(LinkedList<String> l_list, String str1, String str2){
        System.out.println("Original Linked List: " +l_list);
        l_list.addFirst(str1);
        l_list.addLast(str2);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void RemoveElement_str(LinkedList<String> l_list, int index){
        System.out.println("Original Linked List: " +l_list);
        l_list.remove(index);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void RemoveAll_str(LinkedList<String> l_list){
        System.out.println("Original Linked List: " +l_list);
        l_list.clear();
        System.out.println("Modified Linked List: " +l_list);
    }
    public void swapTwo_str(LinkedList<String> l_list, int index1, int index2){
        System.out.println("Original Linked List: " +l_list);
        Collections.swap(l_list, index1, index2);  //swap the element at index1 with the element at index2
        System.out.println("Modified Linked List: " +l_list);
    }
    public void shuffleElements_str(LinkedList<String> l_list){
        System.out.println("Original Linked List: " +l_list);
        Collections.shuffle(l_list);
        System.out.println("Modified Linked List: " +l_list);
    }
    public void link_two_l_list_str(LinkedList<String> l_list1, LinkedList<String> l_list2){
        LinkedList<String> l_list3 = new LinkedList<String>();
        System.out.println("Original Linked List: " +l_list1);
        l_list3.addAll(l_list1);
        l_list3.addAll(l_list2);
        System.out.println("Result: " +l_list3);
    }
    public void copy_str(LinkedList<String> l_list){
        LinkedList<String> l_list2 = new LinkedList<String>();
        System.out.println("Original Linked List: " +l_list);
        l_list2 = new LinkedList<>(l_list);
    }
    public void copy_char(LinkedList<Character> l_list){
        LinkedList<Character> l_list2 = new LinkedList<Character>();
        System.out.println("Original Linked List: " +l_list);
        l_list2 = new LinkedList<>(l_list);
    }
    public void getElement_double(LinkedList<String> l_list, int index){
        System.out.println(l_list.get(index));
    }
    public void getElement_char(LinkedList<Character> l_list, int index){
        System.out.println(l_list.get(index));
    }

    public void toList_str(LinkedList<String> l_list){
        List<String> list = new ArrayList<String>(l_list);
    }

    public void toList_char(LinkedList<Character> l_list){
        List<Character> list = new ArrayList<Character>(l_list);
    }
    public ArrayList<String> Compare_str(LinkedList<String> l_list, LinkedList<String> l_list2){
        ArrayList<String> list = new ArrayList<String>();
        for(String l : l_list){
            list.add(l_list2.contains(l) ? "yes" : "no");
        }
        return list;
    }
    public ArrayList<String> Compare_char(LinkedList<Character> l_list, LinkedList<Character> l_list2){
        ArrayList<String> list = new ArrayList<String>();
        for(char l : l_list){
            list.add(l_list2.contains(l) ? "yes" : "no");
        }
        return list;
    }
    public boolean isEmpty_str(LinkedList<String> l_list){
        return l_list.isEmpty();
    }
    public boolean isEmpty(LinkedList<Character> l_list){
        return l_list.isEmpty();
    }
    public void set_new_str(LinkedList<String> l_list, String str, int index){
        l_list.set(index, str);
        System.out.println(l_list);
    }
    public void set_new_char(LinkedList<Character> l_list, char num, int index){
        l_list.set(index, num);
        System.out.println(l_list);
    }
}
