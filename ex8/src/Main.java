
import ExceptionsStack.*;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) throws StackUnderFlow, StackOverFlow, StackUnder2, NotStoredElement {
        Stack st = new Stack(10);
        Stack st2 = new Stack(5);
        try {
            st.push(5);  //push 5 elements to the stack st: if i add more than 5 elements I got StackOverFlowException
            st.push(5);
            st.push(20);
            st.push(20);
            st.push(-35);
            st.push(-200);
            st.push(10000);
            st.push(153);
            st.push(81);
            st.push(-267);

            st2.push(5);
            st2.push(20);
            st2.push(-2000);
            st2.push(81);
            st2.push(153);

            System.out.println("First Stack:");
            st.printStack();  //print stack st using the method printStack defined in the class Stack
            System.out.println(st.countElements()+ " Elements in the First Stack");  //count the elements of the stack using the method countElements defined in the class Stack
            st.FindTopBottom();  //find top and bottom elements of the first stack

            System.out.println("\nSecond Stack:");
            st2.printStack();  //print the second stack
            System.out.println(st2.countElements()+ " Elements in the Second Stack");
            st2.FindTopBottom();  //find top and bottom elements of the second stack


            System.out.print("\nCommon Elements between First Stack and Second Stack: ");
            int[] arr = st.findCommonElements(st2);  //store common elements into array arr using the method findCommonElements and then print the array
            for(int i : arr){
                System.out.print(i + " ");
            }

        } catch (StackOverFlow | StackUnderFlow  e) {
            System.out.println(e.toString());
        }

        try{   //operations on the stack st and stack st2

            System.out.println("\nThe Maximum Value in the first stack is: " +st.findMax()); //print the maximum value of the stack using the method findMax defined in the class Stack

            System.out.println("\nThe Minimum Value in the first stack is: " +st.findMin());  //print the minimum value of the stack using the method findMin defined in the class Stack

            st.RemoveDuplicate();  //remove duplicate elements in the stack st using the method RemoveDuplicate defined in the class Stack

            System.out.println("\nStack with the first two elements swapped:");
            st2.SwapTopTwo();

            st2.RemoveElement();   //remove an element from the second stack

            /*when I remove all elements i got StackUnderFlowException
              so the method remove() will be executed at the end
             */
            st.remove();  //remove all elements from the stack st
            st2.remove(); //remove all elements from the stack st2

        } catch (StackOverFlow | StackUnderFlow | StackUnder2 | NotStoredElement e) {
            System.out.println(e.toString());
        }

        StringStack strStack = new StringStack("hello");
        System.out.println("\n" +strStack.getStr());
        System.out.println(strStack.getReversedStr());  //print reversedString initialized inside object StringStack using the method reverseString defined in the class String Stack
    }
}