package arrays;

public class indexofarray3 {
        public static int findIndex(int[] array, int element) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == element) {
                    return i;
                }
            }
            return -1; // Element not found
        }
        public static void main(String[] args) {
            int[] array = {10, 20, 30, 40, 50};
            System.out.println("Index of 30: " + findIndex(array, 30));
        }
}
