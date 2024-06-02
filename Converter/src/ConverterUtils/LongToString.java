package ConverterUtils;

import ExceptionsClasses.DecimalExc;

import java.util.*;

public class LongToString {
    Scanner sc = new Scanner(System.in);
        public void convert() throws DecimalExc {
            System.out.println("Decimal long Number: ");
            long decimalLong = sc.nextLong( );
            String value = String.valueOf(decimalLong);
            if (!value.matches("[0-9]*")) {
                throw new DecimalExc( );
            }
            System.out.println("Converted Value: " + decimalLong);
        }
}
