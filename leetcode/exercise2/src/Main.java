//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isPalindrom(int x) {
        if(x < 0) {
            return false;
        }
        String num = String.valueOf(x);
        int left = 0;
        int right = num.length() - 1;
        while(left < right) {
            if(num.charAt(left)!= num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrom(x));
    }
}