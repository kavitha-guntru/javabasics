class Parentthisanndsuper6 {
    int number = 100;
    String text = "Parent Class";

    void display() {
        System.out.println("In Parent Display Method");
    }
}

class ChildClass extends Parentthisanndsuper6 {
    int number = 200;
    String text = "Child Class";

    void display() {
        System.out.println("In Child Display Method");
    }

    void useThisAndSuper() {
        System.out.println("Using this: " + this.number); // Accesses ChildClass number
        System.out.println("Using this: " + this.text);   // Accesses ChildClass text
        this.display(); // Calls ChildClass display()

        System.out.println("Using super: " + super.number); // Accesses ParentClass number
        System.out.println("Using super: " + super.text);   // Accesses ParentClass text
        super.display(); // Calls ParentClass display()
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.useThisAndSuper();
    }
}

