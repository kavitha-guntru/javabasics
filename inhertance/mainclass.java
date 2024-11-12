public class mainclass {
    public static void main(String[] args) {
        // Creating an object for each class
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // Calling every method of each class using its own instance
        System.out.println("Calling methods of Class A:");
        objA.methodA1();
        objA.methodA2();
        objA.overrideMethod();
        System.out.println();

        System.out.println("Calling methods of Class B:");
        objB.methodA1(); // Inherited from A
        objB.methodA2(); // Inherited from A
        objB.methodB1();
        objB.methodB2();
        objB.overrideMethod();
        System.out.println();

        System.out.println("Calling methods of Class C:");
        objC.methodA1(); // Inherited from A
        objC.methodA2(); // Inherited from A
        objC.methodB1(); // Inherited from B
        objC.methodB2(); // Inherited from B
        objC.methodC1();
        objC.methodC2();
        objC.overrideMethod();
        System.out.println();

        // Calling overridden method with superclass reference to B and C class's objects
        A refB = new B();
        A refC = new C();
        
        System.out.println("Calling overridden method with superclass reference:");
        refB.overrideMethod(); // Should call B's overrideMethod
        refC.overrideMethod(); // Should call C's overrideMethod
        System.out.println();

        // Runtime polymorphism with data members
        System.out.println("Runtime Polymorphism with Data Members:");
        System.out.println("Data in A (with A reference): " + objA.data);
        System.out.println("Data in B (with A reference to B object): " + refB.data); // A's data, since data members are not polymorphic
        System.out.println("Data in C (with A reference to C object): " + refC.data); // A's data, since data members are not polymorphic
        System.out.println("Data in B (with B reference): " + objB.data); // B's data
        System.out.println("Data in C (with C reference): " + objC.data); // C's data
    }
}