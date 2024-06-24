package ExceptionsStack;

public class StackUnder2 extends Exception{
    public String toString(){
        return "Stack has less than two elements";
    }
}
