class ParentClassSuper5 {
    int number;
    String text;

    ParentClassSuper5(int number, String text) {
        this.number = number;
        this.text = text;
    }
}

class ChildClass extends ParentClassSuper5 {
    ChildClass() {
        super(50, "Parent Text"); // Calls the constructor of ParentClass
    }

    void printParentFields() {
        System.out.println("Parent Number: " + number);
        System.out.println("Parent Text: " + text);
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.printParentFields();
    }
}

