package ConverterUtils;
import ExceptionsClasses.StringExc;
import java.util.*;
public class StringToLong {
    Scanner sc = new Scanner(System.in);
    public void convert() throws StringExc{
        System.out.println("String Value: ");
        String value = sc.nextLine();
        if(!value.matches("[0-9]*")){
            throw new StringExc();
        }
        long result = Long.parseLong(value);
        System.out.println("Converted String: " +result);
    }
}
