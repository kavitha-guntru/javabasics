package arrays;
public class minandmax8 {
        public static int[] minMax(int[] array) {
            int min = array[0];
            int max = array[0];
            for (int value : array) {
                if (value < min) min = value;
                if (value > max) max = value;
            }
            return new int[]{min, max};
        }
    
        public static void main(String[] args) {
            int[] array = {10, 20, 5, 30, 15};
            int[] minMax = minMax(array);
            System.out.println("Minimum: " + minMax[0] + ", Maximum: " + minMax[1]);
        } 
    
}
