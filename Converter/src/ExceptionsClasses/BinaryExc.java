package ExceptionsClasses;

public class BinaryExc extends NumberFormatException{
    @Override
    public String toString() {
        return "Invalid Binary Number";
    }
}
