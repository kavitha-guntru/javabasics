interface DefaultMethodInterface {
    default void defaultMethod() {
        System.out.println("Default method in interface.");
    }
}

class DefaultMethodClass6 implements DefaultMethodInterface {
    public static void main(String[] args) {
        DefaultMethodClass6 obj = new DefaultMethodClass6();
        obj.defaultMethod();
    }
}

