import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int RomanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        int sum = 0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");
        for(int i = 0; i < s.length(); i++){
            sum +=  map.get(s.charAt(i));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman Number: ");
        String s = sc.nextLine();
        System.out.println(RomanToInt(s));
    }
}