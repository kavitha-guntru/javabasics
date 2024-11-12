package exception;
public class MultipleCatchExample4 {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

