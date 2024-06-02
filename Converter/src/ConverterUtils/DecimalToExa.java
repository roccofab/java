package ConverterUtils;
import ExceptionsClasses.DecimalExc;
import java.util.*;
public class DecimalToExa {
    Scanner sc = new Scanner(System.in);
    public void convert(){
        System.out.println("Decimal Number: ");
        int decimal = sc.nextInt();
        String d = String.valueOf(decimal);
        if (!d.matches("[0-9]*"))
        {
            throw new DecimalExc();
        }
        String exa = Integer.toHexString(decimal);
        System.out.println("Hexadecimal Number: " + exa);
    }
}
