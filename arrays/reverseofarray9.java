package arrays;
import java.util.Arrays;
public class reverseofarray9 {
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Reversed array: " + Arrays.toString(reverseArray(array)));
    }
}

    

