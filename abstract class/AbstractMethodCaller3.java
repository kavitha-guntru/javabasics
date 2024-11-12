class AbstractMethodCaller extends AbstractClass1 {
    @Override
    void abstractMethod() {
        System.out.println("Calling abstract method from the child class.");
    }

    public static void main(String[] args) {
        AbstractMethodCaller obj = new AbstractMethodCaller();
        obj.abstractMethod();
    }
}

