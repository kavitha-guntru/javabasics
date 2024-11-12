package exception;
import java.io.FileWriter;
import java.io.IOException;

public class IOException12 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("readonlyfile.txt"); // File might be read-only
            writer.write("Hello, world!");
            writer.close();
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}

