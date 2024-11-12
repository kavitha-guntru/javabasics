package loops;

public class oddeven4 {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
            System.out.println("Even Numbers:");
            for (int num : numbers) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
    
            System.out.println("\nOdd Numbers:");
            for (int num : numbers) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }
}
    
    

