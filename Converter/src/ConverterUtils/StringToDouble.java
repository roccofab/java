package ConverterUtils;
import ExceptionsClasses.StringExc;
import java.util.*;

public class StringToDouble {
    Scanner sc = new Scanner(System.in);
    public void convert() throws StringExc {
        System.out.println("Value: ");
        String value = sc.nextLine();
        if(!value.matches("[+-]?\\d*\\.?\\d+")){
            throw new StringExc();
        }
        double result = Double.parseDouble(value);
        System.out.println("String Converted: " + result);
    }
}
