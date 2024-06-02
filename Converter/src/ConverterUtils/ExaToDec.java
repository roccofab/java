package ConverterUtils;
import ExceptionsClasses.ExadecimalExc;

import java.util.*;

public class ExaToDec {
    Scanner sc = new Scanner(System.in);

    public void convert() throws ExadecimalExc{
        System.out.println("Exadecimal Number: ");
        String exa = sc.nextLine();
        if(!exa.matches("[0-9A-Fa-f]+")){
            throw new ExadecimalExc();
        }
        int decimal = Integer.parseInt(exa, 16);
        System.out.println("Decimal: " +decimal);
    }
}
