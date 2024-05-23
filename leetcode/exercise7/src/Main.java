/*Given a string s consisting of words and spaces,
 return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example:
Input: s = "Hello World"
Output: 5
 */

public class Main {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
                flag = true;
            } else if (flag) {
                break;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}