package javaio;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadText3 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"))) {
            int content;
            while ((content = bis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

