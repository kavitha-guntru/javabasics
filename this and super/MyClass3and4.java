class MyClass3and4 {
    int number;
    String text;

    MyClass3and4() {
        this(30, "ANIMAL"); // Calls the constructor with arguments
    }

    MyClass3and4(int number, String text) {
        this.number = number;
        this.text = text;
    }

    void printFields() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        MyClass3and4 obj = new MyClass3and4();
        obj.printFields();
    }
}

