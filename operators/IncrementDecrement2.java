package operators;
public class IncrementDecrement2 {
   
        public static void main(String[] args) {
            int x = 10;
    
            incrementAndDecrement(x);
        }
        // Method to demonstrate increment and decrement
        static void incrementAndDecrement(int x) {
            System.out.println("Initial value: " + x);
            x++;
            System.out.println("After increment (x++): " + x);
            x--;
            System.out.println("After decrement (x--): " + x);
        }
}
    
    

