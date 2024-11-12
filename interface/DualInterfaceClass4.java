interface FirstInterface {
    void firstMethod();
}

interface SecondInterface {
    void secondMethod();
}

class DualInterfaceClass4 implements FirstInterface, SecondInterface {
    @Override
    public void firstMethod() {
        System.out.println("First interface method implemented.");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second interface method implemented.");
    }

    public static void main(String[] args) {
        DualInterfaceClass4 obj = new DualInterfaceClass4();
        obj.firstMethod();
        obj.secondMethod();
    }
}

