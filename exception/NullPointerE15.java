package exception;
public class NullPointerE15
{
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // Throws NullPointerException
    }
}

