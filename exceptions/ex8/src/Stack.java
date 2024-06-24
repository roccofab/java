import ExceptionsStack.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Stack {
    private int size;
    private int top = -1;
    private int x;
    private int[] s;

    public Stack(int sz) {
        size = sz;
        s = new int[sz];
    }

    public void push(int x) throws StackOverFlow {
        if (top == size - 1)
            throw new StackOverFlow();
        top++;
        s[top] = x;
    }

    public int pop() throws StackUnderFlow {
        if (top == -1)
            throw new StackUnderFlow();
        int val = s[top];
        top--;
        return val;
    }

    public void printStack() throws StackUnderFlow {
        if (top == -1)
            throw new StackUnderFlow();
        for (int i = top; i >= 0; i--)  //iterate across stack and print the value at index i
            System.out.print(s[i] + " ");
        System.out.println();
    }

    public int findMax() throws StackUnderFlow {
        if (top == -1) {
            throw new StackUnderFlow();
        }
        int max = s[0];  //initialize max at first element of stack
        for (int i = 0; i < top; i++) {
            if (s[i] > max)  //if element of the stack at index i is greater than max: assign it to max
                max = s[i];
        }
        return max;
    }

    public int findMin() throws StackUnderFlow {
        if (top == -1)
            throw new StackUnderFlow();
        int min = s[0];
        for (int i = 0; i <= top; i++) {
            if (s[i] < min)  //if element of the stack at index i is less than min: assign it to min
                min = s[i];
        }
        return min;
    }

    public void remove() throws StackUnderFlow {
        /* if stack is empty: throw StackUnderFlowException*
         *if stack is not empty: remove the top element of the stack*
           using the method pop()*
         * pop elements on the top till the stack is empty*
         * when the stack is empty: throw StackUnderFlowException one more time*
         */
        if (top == -1)
            throw new StackUnderFlow();

        while (top != -1) {
            pop();
        }
        if (top == -1) {
            throw new StackUnderFlow();
        }
    }

    public int countElements() throws StackUnderFlow {
        /*if stack is empty: throw StackUnderFlowException
         *if stack is not empty: count the number of elements in the stack iterating across it
         */
        if (top == -1)
            throw new StackUnderFlow();

        int count = 0;
        for (int i = top; i >= 0; i--) {
            count++;
        }
        return count;
    }

    public void RemoveDuplicate() throws StackUnderFlow, StackOverFlow {
        /*initialize newStack that contains not duplicated values of Stack
          the HashSet is used to keep track of not duplicated values: if the values are not duplicated, add values to newStack
         */
        Stack newStack = new Stack(s.length);
        Set<Integer> tempSet = new HashSet<>();
        if (top == -1) {
            throw new StackUnderFlow();
        } else {
            /*assign the top element of Stack to a current Integer Variable
              *if the element on the top of the stack(current) is not contained in the HashSet tempSet:
               push current on the top of newStack and add current to tempSet
             */
            while (top != -1) {
                int current = s[top]; // Peek at the top element
                if (!tempSet.contains(current)) {
                    newStack.push(current);
                    tempSet.add(current);
                }
                top--; // Pop the element after checking
            }
        }
        System.out.println("New Stack without Duplicated Elements:");
        newStack.printStack();
    }

    public void FindTopBottom() throws StackUnderFlow {
        if (top == -1)
            throw new StackUnderFlow();
        int topElement = s[top];
        int bottomElement = s[0];
        System.out.println("The Element on the top of the Stack: " + topElement);
        System.out.println("The Element on the bottom of the Stack: " + bottomElement);
    }

    public void RemoveElement() throws StackUnderFlow, NotStoredElement {
        /*if the stack is empty throw StackUnderFlowException*
         *First print the stack and then check for an element from input*
         * iterate on the stack and when the element is found moves items one position to the right*
         * print the stack without element*
         */
        if (top == -1)
            throw new StackUnderFlow();
        Scanner sc = new Scanner(System.in);
        printStack();
        System.out.println("Enter element to Remove: ");
        int inp = sc.nextInt();
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (s[i] == inp) {
                found = true;
                for (int j = i; j < top; j++) {
                    s[j] = s[j + 1];
                }
                top--;
            }
        }
        if(!found){
            throw new NotStoredElement();
        }
        System.out.println("Stack without Element:");
        printStack();
    }

    public void SwapTopTwo() throws StackUnderFlow, StackUnder2 { //method to swap two elements at the top of the stack
        if (top == -1)
            throw new StackUnderFlow();

        if (top < 1)  //if the stack has less than two elements: throw StackUnder2Exception
            throw new StackUnder2();

        int temp = s[top];  //swap element at index top with element at index top-1
        s[top] = s[top - 1];
        s[top - 1] = temp;
        printStack();
    }

    public int[] findCommonElements(Stack stack2) throws StackUnderFlow {
        /*if stack1 or stack2 are empty: throw StackUnderFlowExceptio*
         *if stack1 and stack2 are not empty: iterate on stack1 and add elements to HashSet set*
         * iterate on stack2 and if element at index i of the stack2 is contained in set: add it to HashSet set2
           and increment variable commonElements that will be the length of array that contains the common elements
         *add the common elements stored in set2 to the array arr
         */
        if (top == -1 || stack2.top == -1)
            throw new StackUnderFlow();
        int commonElements = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = top; i >= 0; i--){
            set.add(s[i]);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int i = stack2.top; i >= 0; i--){
            if(set.contains(stack2.s[i])){
                set2.add(stack2.s[i]);
                commonElements++;
            }
        }
        int index = 0;
        int[] arr = new int[commonElements];
        for(int i : set2){
                arr[index] = i;
                index++;
        }
        return arr;
    }
}
