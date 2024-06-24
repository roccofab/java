//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
public class Main {
    public static void getBytes(File file){
        System.out.println(file.length()+ " bytes");
    }
    public static long getBit(File file){
        return file.length()*8;
    }
    public static void getMegaBytes(File file){
        System.out.println((file.length())/1024*1024+ " mb");
    }
    public static void getKiloBytes(File file){
        System.out.println(file.length()/1024+ " kb");
    }
    public static void getGigaBytes(File file) {
        double sizeInGigaBytes = (double) file.length() / (1024 * 1024 * 1024);
        System.out.println(sizeInGigaBytes + " GB");
    }
    public static void main(String[] args) {
        File file = new File("Delega.pdf");
        if(file.exists()){
            getBytes(file);
            System.out.println(getBit(file)+ " bit");
            getMegaBytes(file);
            getKiloBytes(file);
            getGigaBytes(file);
        } else
            System.out.println("File does not exist");
    }
}