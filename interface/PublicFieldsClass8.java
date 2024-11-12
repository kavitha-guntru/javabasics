interface PublicFieldsInterface {
    int VALUE = 10;
    String NAME = "Jala Academy";
    
    void printDetails();
}

class PublicFieldsClass8 implements PublicFieldsInterface {
    @Override
    public void printDetails() {
        System.out.println("Value: " + VALUE);
        System.out.println("Name: " + NAME);
    }

    public static void main(String[] args) {
        PublicFieldsClass8 obj = new PublicFieldsClass8();
        obj.printDetails();
    }
}

