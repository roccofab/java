package ConverterUtils;
import ExceptionsClasses.BooleanExc;

import java.util.*;

public class BooleanToString {
    Scanner sc = new Scanner(System.in);

    public void Convert(boolean b) throws BooleanExc{
        if(!b){
            throw new BooleanExc();
        }
        String value = String.valueOf(b);
        System.out.println("Converted Boolean Value: " +value);
    }
}
