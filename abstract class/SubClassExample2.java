class SubClassExample extends AbstractClass1 {
    // Implementation of abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in the subclass.");
    }
    public static void main(String[] args) {
        // Create an instance of SubClassExample
        SubClassExample obj = new SubClassExample();
        
        // Call non-abstract method from the superclass
        obj.nonAbstractMethod();
    }
}
