package loops;

public class ifelseprintno13 {
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int c = 30;
            int largest;
    
            if (a > b && a > c) {
                largest = a;
            } else if (b > c) {
                largest = b;
            } else {
                largest = c;
            }
    
            System.out.println("The largest number is: " + largest);
        }
    }
    
    

