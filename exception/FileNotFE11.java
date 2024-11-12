package exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFE11{
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

