package methodoverloading;
class OverloadingExample1 {
    // Method with one int parameter
    void display(int a) {
        System.out.println("Method with one parameter: " + a);
    }
    // Method with two int parameters
    void display(int a, int b) {
        System.out.println("Method with two parameters: " + a + ", " + b);
    }
    public static void main(String[] args) {
        OverloadingExample1 obj = new OverloadingExample1();
        obj.display(10);          
        obj.display(20, 30);      
    }
}

