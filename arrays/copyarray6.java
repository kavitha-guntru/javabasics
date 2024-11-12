package arrays;
import java.util.Arrays;
public class copyarray6 {
    public static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] copiedArray = copyArray(array);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }
}

    

