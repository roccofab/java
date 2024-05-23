import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {  //converte la stringa in array di caratteri e itera sull'array di caratteri
            if(c == '(' || c == '[' || c == '{'){  // se il primo carattere nell'array è ( oppure [ oppure {: aggiunge in cima allo stack il carattere
                stack.push(c);
            } else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') { // se il carattere corrente é ) e il carattere aggiunto precedentemente è (: viene rimosso dallo stack, è importante controllare che lo stack non sia vuoto altrimenti si EmptyStackException
                stack.pop();
            } else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {  // se il carattere corrente é ] e il carattere aggiunto precedentemente è [: viene rimosso dallo stack, è importante controllare che lo stack non sia vuoto altrimenti si EmptyStackException
                stack.pop();
            } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {  // se il carattere corrente é } e il carattere aggiunto precedentemente è {: viene rimosso dallo stack, è importante controllare che lo stack non sia vuoto altrimenti si EmptyStackException
                stack.pop();
            } else {   //se le condizioni sopra non sono vere allora le parentesi non corrispondono e quindi restituisce false
                return false;
            }
        }
        return stack.isEmpty();  //se lo stack è vuoto: tutte le condizioni sono vere e quindi restituisce true
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}
