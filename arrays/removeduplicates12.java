package arrays;
import java.util.Arrays;
public class removeduplicates12 {
    public static int[] removeDuplicates(int[] array) {
        Arrays.sort(array);
        int[] temp = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[array.length - 1];
        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Array without duplicates: " + Arrays.toString(removeDuplicates(array)));
    }
}

    
