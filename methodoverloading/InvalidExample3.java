package methodoverloading;
public class InvalidExample3 {
    int show(int a) {
        return a * 2;
    }

    // Method with double parameter
    String show(double a) {
        return "Result: " + (a * 2);
    }

    public static void main(String[] args) {
        InvalidExample3 obj = new InvalidExample3();
        System.out.println(obj.show(10));      
        System.out.println(obj.show(10.5));    
    }
}