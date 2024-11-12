package arrays;
import java.util.HashSet;
public class findcommonvalues11 {
    public static void findCommonValues(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int value : array1) {
            set.add(value);
        }
        for (int value : array2) {
            if (set.contains(value)) {
                System.out.println("Common element: " + value);
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        findCommonValues(array1, array2);
    }
}

    
