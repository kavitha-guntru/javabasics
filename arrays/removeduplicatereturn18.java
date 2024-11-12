package arrays;
public class removeduplicatereturn18 {
        public static int[] removeDuplicates(int[] array) {
            int n = array.length;
            int[] tempArray = new int[n];
            int newSize = 0;
    
            // Traverse the original array
            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false;
    
                // Check if the current element is already in tempArray
                for (int j = 0; j < newSize; j++) {
                    if (array[i] == tempArray[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
    
                // If the element is not a duplicate, add it to tempArray
                if (!isDuplicate) {
                    tempArray[newSize] = array[i];
                    newSize++;
                }
            }
    
            // Create a result array with the exact size of unique elements
            int[] resultArray = new int[newSize];
            for (int i = 0; i < newSize; i++) {
                resultArray[i] = tempArray[i];
            }
    
            return resultArray;
        }
    
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 4};
            int[] newArray = removeDuplicates(array);
    
            // Printing the result array without using predefined functions
            System.out.print("Array without duplicates: ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
}
