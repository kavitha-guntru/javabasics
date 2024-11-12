package arrays;
public class secondlargest13 {
        public static int findSecondLargest(int[] array) {
            int firstLargest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
    
            for (int num : array) {
                if (num > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = num;
                } else if (num > secondLargest && num != firstLargest) {
                    secondLargest = num;
                }
            }
            return secondLargest;
        }
    
        public static void main(String[] args) {
            int[] array = {12, 35, 1, 10, 34, 1};
            System.out.println("Second largest number: " + findSecondLargest(array));
        } 
}
