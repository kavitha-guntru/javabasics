package exception;
class MyCustomException6 extends Exception {
    public MyCustomException6(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyCustomException6("This is a custom exception.");
        } catch (MyCustomException6 e) {
            System.out.println(e.getMessage());
        }
    }
}

