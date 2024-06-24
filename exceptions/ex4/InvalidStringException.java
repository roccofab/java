class InvalidStringException extends Exception{
 public String toString(){
   super("String does not represent a number");
 }

 public InvalidStringException(String message) {
        super(message);
    }
}