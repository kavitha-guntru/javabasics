package arrays;
import java.util.Arrays;
public class removeelement5 {
    public static int[] removeElement(int[] array, int element) {
        int count = 0;
        for (int value : array) {
            if (value == element) count++;
        }

        int[] result = new int[array.length - count];
        int index = 0;
        for (int value : array) {
            if (value != element) {
                result[index++] = value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 30};
        System.out.println("Array after removing 30: " + Arrays.toString(removeElement(array, 30)));
    }
}

    

