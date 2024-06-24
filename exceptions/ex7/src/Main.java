import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    static void Divide() throws Exception {
        try(FileInputStream fi = new FileInputStream("filename.txt")) {
            Scanner sc = new Scanner(fi);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / b);
        }
    }
    public static void main(String[] args) throws Exception {
        try
        {
            Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}