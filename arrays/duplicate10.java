package arrays;
import java.util.HashSet;
public class duplicate10 {

    public static void findDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        for (int value : array) {
            if (!seen.add(value)) {
                System.out.println("Duplicate found: " + value);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 5, 2};
        findDuplicates(array);
    }
}


