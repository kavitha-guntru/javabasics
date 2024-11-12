package exception;
public class ClassNotFE10 {
    public static void main(String[] args) {
        try {
            Class.forName("NonExistentClass"); // Will throw ClassNotFoundException
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}

