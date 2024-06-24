public class EmptyFileException extends Exception{
    @Override
    public String getMessage(){
       return "File is Empty";
    }
}
