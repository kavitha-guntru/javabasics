package arrays;
public class findevenodd15 {
        public static void countEvenOdd(int[] array) {
            int evenCount = 0;
            int oddCount = 0;
    
            for (int num : array) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            System.out.println("Even numbers: " + evenCount);
            System.out.println("Odd numbers: " + oddCount);
        }
    
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            countEvenOdd(array);
        }
}
