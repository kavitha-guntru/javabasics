package exception;
import java.lang.reflect.Field;

public class NoSuchFE13 {
    public int exampleField;

    public static void main(String[] args) {
        try {
            Field field = NoSuchFE13.class.getField("nonExistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("No such field: " + e.getMessage());
        }
    }
}

