package methodoverloading;
public class OverloadingExample4 {
    // Method with one int parameter
    void show(int a) {
        System.out.println("Method with int parameter: " + a);
    }
    // Method with one double parameter
    void show(double b) {
        System.out.println("Method with double parameter: " + b);
    }
    public static void main(String[] args) {
        OverloadingExample4 obj = new OverloadingExample4();
        obj.show(10);       
        obj.show(20.5);     
    }
}

