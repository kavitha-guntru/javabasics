package javaio;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextBuffere8 {
    public static void main(String[] args) {
        String text = "Hello, this is written using BufferedWriter!";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

