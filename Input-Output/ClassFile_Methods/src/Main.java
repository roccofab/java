import UtilsFile.FileMethods;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File file = new File("MyFile.txt");

            System.out.println("File " + file.getName() + " exists: " + file.exists());
            System.out.println("File " + file.getName() + " can be read: " + file.canRead());
            System.out.println("File " + file.getName() + " can be written: " + file.canWrite());
            System.out.println("File " + file.getName() + " path: " + file.getAbsolutePath());
            System.out.println("File " + file.getName() + " has size: " + file.length() + " bytes");

            if (!file.exists()) {
                System.out.println("File " + file.getName() + " does not exist");
                return; // Exit the program if the file does not exist
            }

            System.out.println("File " + file.getName() + " has " + FileMethods.countLines(file) + " rows");

            System.out.println("Enter the number of Line to read: ");
            int lineNumber = sc.nextInt();
            sc.nextLine(); // Consume newline left-over
            System.out.println(FileMethods.getLine(file, lineNumber));

            System.out.println("Add New Line to the File (yes or no): ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Enter the new line: ");
                String newLine = sc.nextLine();
                FileMethods.addLine(file, newLine);
                System.out.println("File " + file.getName() + " has now " + FileMethods.countLines(file) + " rows");
            } else {
                System.out.println("File " + file.getName() + " has " + FileMethods.countLines(file) + " rows");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
