public class B extends A {
    void methodB1() {
        System.out.println("Method B1 in Class B");
    }

    void methodB2() {
        System.out.println("Method B2 in Class B");
    }

    @Override
    void overrideMethod() {
        System.out.println("Overridden method in Class B");
    }
}