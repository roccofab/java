//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.util.Date;
// program to determine the last modified date of a file.
public class Main {
    public static void main(String[] args) {
        File file = new File("13-JCF-breve.pdf");
        Date date = new Date(file.lastModified());
        System.out.println("Last Modified on " +file.getName()+ ": " +date);
    }
}