package constructor;

public class MainClass {
        public static void main(String[] args) {
            MyClass obj1 = new MyClass();          // Calls default constructor
            MyClass obj2 = new MyClass(10);        // Calls one argument constructor
            MyClass obj3 = new MyClass(20, "Hello"); // Calls two argument constructor
        }
}
