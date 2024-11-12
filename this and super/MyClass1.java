public class MyClass1 {
    int number = 42;
    String text = "Hello, world!";
    MyClass1() {
        printFields();
    }
    void printFields() {
        // Using 'this' to refer to instance members
        System.out.println("Number: " + this.number);
        System.out.println("Text: " + this.text);
    }
    public static void main(String[] args) {
        new MyClass1();
    }
}
