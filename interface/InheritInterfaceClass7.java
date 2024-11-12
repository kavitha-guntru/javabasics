interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class InheritInterfaceClass7 implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Parent interface method implemented.");
    }

    @Override
    public void childMethod() {
        System.out.println("Child interface method implemented.");
    }

    public static void main(String[] args) {
        InheritInterfaceClass7 obj = new InheritInterfaceClass7();
        obj.parentMethod();
        obj.childMethod();
    }
}

