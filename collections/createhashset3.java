package collections;
import java.util.HashSet;

public class createhashset3 {
    public static void main(String[] args) {
        // Create a HashSet with 10 elements of type String
        HashSet<String> set = new HashSet<>();

        // Add 10 elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");
        set.add("Fig");
        set.add("Grapes");
        set.add("Honeydew");
        set.add("Indian Fig");
        set.add("Jackfruit");

        // Display the elements in the HashSet
        System.out.println("Original HashSet: " + set);

        // Remove an element from the HashSet
        set.remove("Date");
        System.out.println("After removing Date: " + set);

        // Check if an element is present in the HashSet
        if (set.contains("Apple")) {
            System.out.println("Apple is present in the HashSet");
        }

        // Check the size of the HashSet
        System.out.println("Size of the HashSet: " + set.size());

        // Check if the HashSet is empty
        if (set.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }

        // Add all elements from another HashSet
        HashSet<String> newSet = new HashSet<>();
        newSet.add("Mango");
        newSet.add("Nectarine");
        set.addAll(newSet);
        System.out.println("HashSet after adding all elements from newSet: " + set);

        // Remove all elements from the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}

