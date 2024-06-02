package ConverterUtils;
import ExceptionsClasses.BinaryExc;
import java.util.*;

public class BinaryToOctal {
    Scanner sc = new Scanner(System.in);
    public void convert() throws BinaryExc {
        System.out.println("Binary Number: ");
        String binary = sc.nextLine();
            if (!binary.matches("[0-1]+")) {
                throw new BinaryExc();
            }
            int decimal = Integer.parseInt(binary, 2);  //base for binary numbers is 2
            String octal = Integer.toOctalString(decimal);
            System.out.println("Octal: " + octal);
    }
}
