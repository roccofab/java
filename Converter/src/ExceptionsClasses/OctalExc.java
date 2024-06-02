package ExceptionsClasses;

public class OctalExc extends NumberFormatException{
    @Override
    public String toString(){
        return "Invalid Octal Number";
    }
}
