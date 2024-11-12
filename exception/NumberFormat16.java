package exception;
public class NumberFormat16 {
    public static void main(String[] args) {
        String invalidNumber = "abc";
        int number = Integer.parseInt(invalidNumber); // Throws NumberFormatException
    }
}

