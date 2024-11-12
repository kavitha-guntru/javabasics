package javaio;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteText4 {
    public static void main(String[] args) {
        String text = "Hello, this is written using BufferedOutputStream!";
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            bos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

