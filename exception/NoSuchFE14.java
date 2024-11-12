package exception;
import java.lang.reflect.Method;

public class NoSuchFE14 {
    public static void main(String[] args) {
        try {
            Method method = NoSuchFE14.class.getMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("No such method: " + e.getMessage());
        }
    }
}

