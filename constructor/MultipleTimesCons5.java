package constructor;
class MultipleTimescons5 {
    int number;
    String text;
    // Constructor
    MultipleTimescons5(int number, String text) {
        this.number = number;
        this.text = text;
        System.out.println("Constructor called with number: " + number + " and text: " + text);
    }
    void reinitialize(int newNumber, String newText) {
        this.number = newNumber;
        this.text = newText;
        System.out.println("Reinitialized with number: " + newNumber + " and text: " + newText);
    }
    public static void main(String[] args) {
        MultipleTimescons5 obj = new MultipleTimescons5(10, "Hello");
        // Simulate calling the constructor again by using reinitialize method
        obj.reinitialize(20, "World");
    }
}

