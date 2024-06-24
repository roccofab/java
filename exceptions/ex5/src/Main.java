//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("txt.txt"));
            String line;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally{
            if (reader!= null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}