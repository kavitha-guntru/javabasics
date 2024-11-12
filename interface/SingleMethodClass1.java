interface SingleMethodInterface {
    void display();
}

class SingleMethodClass1 implements SingleMethodInterface {
    @Override
    public void display() {
        System.out.println("Single method in interface implemented in class.");
    }

    public static void main(String[] args) {
        SingleMethodClass1 obj = new SingleMethodClass1();
        obj.display();
    }
}


