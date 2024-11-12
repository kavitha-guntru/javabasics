package javaio;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileHandle6 {
    public static void main(String[] args) {
        String text = "Hello, this is written using FileWriter!";
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

