import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void meth1() throws Exception {
        try(BufferedReader reader = new BufferedReader(new FileReader("filename.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        meth1();
    }
}