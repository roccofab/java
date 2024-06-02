package ConverterUtils;

import ExceptionsClasses.DecimalExc;

import java.util.*;

public class DecimalOctal {
    Scanner sc = new Scanner(System.in);

    public void Convert() {
        System.out.println("Decimal Number: ");
        int decimal = sc.nextInt();
        String d = String.valueOf(decimal);
        if (!d.matches("[0-9]*"))
        {
            throw new DecimalExc();
        }
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal Number: " +octal);
    }
}
