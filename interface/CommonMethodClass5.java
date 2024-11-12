interface InterfaceOne {
    void commonMethod();
}

interface InterfaceTwo {
    void commonMethod();
}

class CommonMethodClass5 implements InterfaceOne, InterfaceTwo {
    @Override
    public void commonMethod() {
        System.out.println("Common method from both interfaces implemented.");
    }

    public static void main(String[] args) {
        CommonMethodClass5 obj = new CommonMethodClass5();
        obj.commonMethod();
    }
}

