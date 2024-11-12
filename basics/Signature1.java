/*1. How to create a class, object, method and its signature. disply code */
package basics;
public class Signature1 {
    
    /* Method declaration*/
    void displayMessage() {
        /* Variable declaration and initialization */
        String message = "Hello, I am Kavitha";
        System.out.println(message); 
    }
    public static void main(String[] args) {
        /* Object creation */
        Signature1 myObject = new Signature1();
        /* Method call on the created object */
        myObject.displayMessage();
    }
}
