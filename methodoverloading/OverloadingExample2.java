package methodoverloading;
class OverloadingExample2 {
    // Method with one int parameter
    void display(int a) {
        System.out.println("Integer parameter: " + a);
    }

    // Method with one String parameter
    void display(String text) {
        System.out.println("String parameter: " + text);
    }

    public static void main(String[] args) {
        OverloadingExample2 obj = new OverloadingExample2();
        obj.display(100);         
        obj.display("Hello");      
    }
}

