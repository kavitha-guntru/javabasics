package arrays;
public class differencelarge16 {
        public static int getDifferenceOfLargestAndSmallest(int[] array) {
            int max = array[0];
            int min = array[0];
    
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            return max - min;
        }
    
        public static void main(String[] args) {
            int[] array = {10, 20, 30, 5, 25};
            System.out.println("Difference between largest and smallest: " + getDifferenceOfLargestAndSmallest(array));
        }
}
