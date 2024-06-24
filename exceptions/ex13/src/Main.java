//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;

public class Main {
    public static void getLines(File file){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("MyFile.txt");
       getLines(file);
       System.out.println("Riprovare con nome corretto");
    }
}