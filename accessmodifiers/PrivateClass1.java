package accessmodifiers;
public class PrivateClass1 {
    private int field1 = 10;
    private String field2 = "Hello";

    private void displayPrivateMethod() {
        System.out.println("Private method in PrivateClass");
    }

    public static void main(String[] args) {
        PrivateClass1 obj = new PrivateClass1();
        System.out.println("Field1: " + obj.field1);
        System.out.println("Field2: " + obj.field2);
        obj.displayPrivateMethod();
    }
}

// Trying to access private members from a subclass
class SubClassOfPrivateClass extends PrivateClass1 {
    void attemptAccess() {
        // System.out.println(field1); // Error: field1 has private access
        // displayPrivateMethod(); // Error: displayPrivateMethod has private access
    }
}
