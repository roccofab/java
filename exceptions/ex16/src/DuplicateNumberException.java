public class DuplicateNumberException extends Exception{
    public DuplicateNumberException(int number) {
        super("Duplicate number found: " + number);
    }
}
