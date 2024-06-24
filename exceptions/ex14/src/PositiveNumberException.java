public class PositiveNumberException extends Exception{
    @Override
    public String getMessage(){
        return "Number is positive:";
    }
}
