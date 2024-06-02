package ConverterUtils;
import ExceptionsClasses.OctalExc;

import java.util.*;

public class OctalToDecimal extends NumberFormatException{
    Scanner sc = new Scanner(System.in);
    public void convert() throws OctalExc {
        System.out.println("Octal Number: ");
        String octal = sc.nextLine();
        if(!octal.matches("[0-7]+")){
            throw new OctalExc();
        }
        int decimal = Integer.parseInt(octal, 8);  //base for octal numbers is 8
        System.out.println("Decimal Number: " + decimal);
    }
}
