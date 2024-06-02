package ConverterUtils;
import ExceptionsClasses.DecimalExc;
import java.util.*;

public class DecimalToBinary {
    Scanner sc = new Scanner(System.in);
    public void Convert() throws DecimalExc{
        System.out.println("Decimal Number: ");
        int decimal = sc.nextInt();
        String d = String.valueOf(decimal);
        if(!d.matches("[0-9]+")){
            throw new DecimalExc();
        }
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary Number. " +binary);
    }
}
