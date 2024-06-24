import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String, Integer> nums = new HashMap<>();
    static {
        nums.put("zero", 0);
        nums.put("one", 1);
        nums.put("two", 2);
        nums.put("three", 3);
        nums.put("four", 4);
        nums.put("five", 5);
        nums.put("six", 6);
        nums.put("seven", 7);
        nums.put("eight", 8);
        nums.put("nine", 9);
        nums.put("ten", 10);
    }

    static int StringToInteger(String str) throws InvalidStringException {
        if (nums.containsKey(str.toLowerCase())) {
            return nums.get(str.toLowerCase());
        } else {
            throw new InvalidStringException();
        }
    }

    static boolean StringToBinary(String str) throws InvalidStringException {
        if (str.matches("[01]+")) {
            return true;
        } else {
            throw new InvalidStringException("Invalid String for Binary Conversion");
        }
    }

    public static void main(String[] args) throws InvalidStringException {
        System.out.println(StringToInteger("one"));
        System.out.println(StringToBinary("01101001"));
    }
}

class InvalidStringException extends Exception {
    public InvalidStringException() {
        super("String does not represent a number");
    }

    public InvalidStringException(String message) {
        super(message);
    }
}
