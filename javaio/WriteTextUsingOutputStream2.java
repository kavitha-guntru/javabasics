package javaio;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTextUsingOutputStream2 {
    public static void main(String[] args) {
        String text = "Hello, this is written using OutputStream!";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

