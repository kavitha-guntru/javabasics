class NonAbstractMethodCaller extends AbstractClass1 {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method in the child class.");
    }

    public static void main(String[] args) {
        NonAbstractMethodCaller obj = new NonAbstractMethodCaller();
        obj.nonAbstractMethod();
    }
}
