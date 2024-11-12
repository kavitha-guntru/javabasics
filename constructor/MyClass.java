package constructor;
class MyClass {
    int number;
    String text;

    // Default constructor
    MyClass() {
        System.out.println("Default constructor called");
    }

    // One argument constructor
    MyClass(int number) {
        this.number = number;
        System.out.println("One argument constructor called with number: " + number);
    }

    // Two argument constructor
    MyClass(int number, String text) {
        this.number = number;
        this.text = text;
        System.out.println("Two argument constructor called with number: " + number + " and text: " + text);
    }
}



