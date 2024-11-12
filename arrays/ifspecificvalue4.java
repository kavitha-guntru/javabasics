package arrays;
public class ifspecificvalue4 {
        public static boolean contains(int[] array, int value) {
            for (int element : array) {
                if (element == value) {
                    return true;
                }
            }
            return false;
        }
        public static void main(String[] args) {
            int[] array = {10, 20, 30, 40, 50};
            System.out.println("Array contains 30: " + contains(array, 30));
        }
    
}
