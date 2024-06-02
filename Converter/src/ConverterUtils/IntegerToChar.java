package ConverterUtils;
import ExceptionsClasses.DecimalExc;
import java.util.*;
public class IntegerToChar {
    Scanner sc = new Scanner(System.in);
    public void convert() throws DecimalExc{
        System.out.println("Integer Number: ");
        int value = sc.nextInt();
        String s = String.valueOf(value);
        if(!s.matches("[0-9]+")){
            throw new DecimalExc();
        }
        char c = (char) value;
        System.out.println(c);
    }
}
