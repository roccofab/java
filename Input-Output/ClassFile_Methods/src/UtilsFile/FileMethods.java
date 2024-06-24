package UtilsFile;

import java.io.*;

public class FileMethods {
    public static int countLines(File file) throws IOException {
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        }
        return lineCount;
    }

    public static String getLine(File file, int lineNumber) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int currentLine = 0;
            while ((line = reader.readLine()) != null) {
                currentLine++;
                if (currentLine == lineNumber) {
                    return line;
                }
            }
        }
        return null; // Return null if the lineNumber is out of bounds
    }

    public static void addLine(File file, String line) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(line);
            writer.newLine();
        }
    }
}

