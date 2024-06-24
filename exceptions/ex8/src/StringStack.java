

import java.util.Stack;

public class StringStack {
 private String str;
 private String reversedStr;

 public StringStack(String str) {
  this.str = str;
  this.reversedStr = reverseString(str);
 }

 public String reverseString(String str){
     Stack<Character> stack = new Stack<>();
     for(char ch : str.toCharArray()){
         stack.push(ch);
     }
     StringBuilder reversedStr = new StringBuilder();
     while(!stack.isEmpty()){
         reversedStr.append(stack.pop());
     }
     return reversedStr.toString();
 }
 public String getStr(){
     return str;
 }
 public String getReversedStr(){
     return reversedStr;
 }
}
