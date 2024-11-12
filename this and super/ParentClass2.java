public class ParentClass2 {
    int parentNumber = 20;
    String parentText = "welcome to my";
}
class ChildClass extends ParentClass2 {
    void printParentFields() {
        System.out.println("Parent Number: " + super.parentNumber);
        System.out.println("Parent Text: " + super.parentText);
    }
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.printParentFields();
    }
}

