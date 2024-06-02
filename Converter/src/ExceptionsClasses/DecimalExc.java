package ExceptionsClasses;

public class DecimalExc extends NumberFormatException{
    @Override
    public String toString(){
        return "Invalid Decimal Number";
    }
}
