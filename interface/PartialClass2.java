interface TwoMethodsInterface {
    void methodOne();
    void methodTwo();
}

class PartialClass2 implements TwoMethodsInterface {
    @Override
    public void methodOne() {
        System.out.println("Method one implemented.");
    }
    @Override
    public void methodTwo() {
        System.out.println("Method two implemented.");
    }

    public static void main(String[] args) {
        PartialClass2 obj = new PartialClass2();
        obj.methodOne();
        obj.methodTwo();
    }
}