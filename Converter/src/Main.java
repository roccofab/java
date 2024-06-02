import ConverterUtils.*;
import ExceptionsClasses.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n\nBinary number to Octal number(1): ");
            System.out.println("Decimal number to Binary number(2): ");
            System.out.println("Octal number to Decimal number(3): ");
            System.out.println("Decimal number to Octal number(4): ");
            System.out.println("Hexadecimal number to Decimal number(5): ");
            System.out.println("Decimal number to Hexadecimal number(6): ");
            System.out.println("Boolean value to String value(7): ");
            System.out.println("String value to Double number(8): ");
            System.out.println("String value to Long number(9): ");
            System.out.println("Long number to String value(10): ");
            System.out.println("Char value to Integer number(11): ");
            System.out.println("Integer number to Char value(12): ");
            System.out.println("EXIT(0): ");
            choice = sc.nextInt();
            if(choice == 1){
                BinaryToOctal b = new BinaryToOctal( );
                b.convert( );
            } else if(choice == 2){
                DecimalToBinary db = new DecimalToBinary( );
                db.Convert( );
            } else if(choice == 3){
                OctalToDecimal od = new OctalToDecimal( );
                od.convert( );
            } else if(choice == 4){
                DecimalOctal toOctal = new DecimalOctal( );
                toOctal.Convert( );
            } else if(choice == 5){
                ExaToDec ed = new ExaToDec( );
                try {
                    ed.convert( );
                } catch (ExadecimalExc e) {
                    System.out.println(e.getMessage( ));
                }
            } else if(choice == 6){
                DecimalToExa de = new DecimalToExa( );
                de.convert( );
            } else if(choice == 7){
                BooleanToString bt = new BooleanToString( );
                try {
                    bt.Convert(true);
                } catch (BooleanExc e) {
                    System.out.println(e.getMessage( ));
                }
            }
            else if(choice == 8){
                StringToDouble sd = new StringToDouble( );
                try {
                    sd.convert( );
                } catch(StringExc e){
                    System.out.println(e.getMessage( ));
                }
            }
            else if(choice == 9){
                StringToLong sl = new StringToLong();
                try{
                    sl.convert();
                } catch(StringExc e){
                    System.out.println(e.getMessage());
                }
            }
            else if(choice == 10){
                LongToString ls = new LongToString();
                try{
                    ls.convert();
                } catch(DecimalExc e){
                    System.out.println(e.getMessage());
                }
            }
            else if(choice == 11){
                CharToInt ci = new CharToInt();
                    ci.convert();
            }
            else if(choice == 12){
                IntegerToChar ic = new IntegerToChar();
                try{
                    ic.convert();
                } catch(DecimalExc e){
                    System.out.println(e.getMessage());
                }
            }
        } while(choice != 0);
    }
}