package arrays;

public class calaverage2 {
        public static double averageArray(int[] array) {
            int sum = 0;
            for (int value : array) {
                sum += value;
            }
            return (double) sum / array.length;
        }
    
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            System.out.println("Average of array: " + averageArray(array));
        }
}
