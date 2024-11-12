package arrays;
import java.util.Arrays;
public class insertelement7 {
    public static int[] insertElement(int[] array, int element, int position) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = element;
            } else {
                newArray[i] = array[j++];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};
        System.out.println("Array after insertion: " + Arrays.toString(insertElement(array, 4, 3)));
    }
}

    

