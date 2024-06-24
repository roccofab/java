import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static boolean isEmpty(String fileName) throws EmptyFileException, FileNotFoundException {
        File file = new File(fileName);
        if(file.length() == 0){
            throw new EmptyFileException();
        }
        return file.length() == 0;
    }
    public static void main(String[] args) {
        try{
            System.out.println(isEmpty("nums.txt"));
        } catch(EmptyFileException e){
            System.out.println(e.getMessage());
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}