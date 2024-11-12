package arrays;
public class specifiedelements17 {
        public static boolean containsTwoElements(int[] array, int element1, int element2) {
            boolean containsElement1 = false;
            boolean containsElement2 = false;
    
            for (int num : array) {
                if (num == element1) {
                    containsElement1 = true;
                }
                if (num == element2) {
                    containsElement2 = true;
                }
            }
    
            return containsElement1 && containsElement2;
        }
    
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 12, 23, 4, 5};
            boolean result = containsTwoElements(array, 12, 23);
            System.out.println("Array contains both 12 and 23: " + result);
        }
}
