package constructor;
class AccessModifiers3 {
    
    // Private constructor
    private AccessModifiers3() {
        System.out.println("Private constructor called");
    }
    // Public constructor
    public AccessModifiers3(int number) {
        System.out.println("Public constructor called with number: " + number);
    }
    // Protected constructor
    protected AccessModifiers3(String text) {
        System.out.println("Protected constructor called with text: " + text);
    }
    // Default (package-private) constructor
    AccessModifiers3(int number, String text) {
        System.out.println("Default constructor called with number: " + number + " and text: " + text);
    }
    public static void main(String[] args) {
        // Creating objects using constructors with different access modifiers
        AccessModifiers3 obj1 = new AccessModifiers3(10);
        AccessModifiers3 obj2 = new AccessModifiers3("Hello");
        AccessModifiers3 obj3 = new AccessModifiers3(20, "World");
    }
}

