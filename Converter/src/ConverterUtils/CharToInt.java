package ConverterUtils;
import java.util.*;

public class CharToInt {
    Scanner sc = new Scanner(System.in);
    public void convert() {
        System.out.println("Single Character: ");
        char c = sc.next().charAt(0);
        int value = (int) c;
        System.out.println(value);
    }
}
