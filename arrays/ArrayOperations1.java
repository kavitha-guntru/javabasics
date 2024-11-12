package arrays;
    public class ArrayOperations1 {
        public static int sumArray(int[] array) {
            int sum = 0;
            for (int value : array) {
                sum += value;
            }
            return sum;
        }
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            System.out.println("Sum of array: " + sumArray(array));
        }
    
}
