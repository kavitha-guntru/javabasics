package constructor;
public class ParentClass2 {
    ParentClass2() {
        System.out.println("Default constructor of ParentClass called");
    }

    ParentClass2(int number) {
        System.out.println("Argument constructor of ParentClass called with number: " + number);
    }
}

class ChildClass extends ParentClass2 {
    ChildClass() {
        super(); // Calls the default constructor of the parent class
        System.out.println("Default constructor of ChildClass called");
    }

    ChildClass(int number) {
        super(number); // Calls the argument constructor of the parent class
        System.out.println("Argument constructor of ChildClass called with number: " + number);
    }
    
    public static void main(String[] args) {
        ChildClass obj1 = new ChildClass();       // Calls default constructors
        ChildClass obj2 = new ChildClass(42);     // Calls argument constructors
    }
}

