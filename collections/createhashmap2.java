package collections;
import java.util.HashMap;
import java.util.Map;

public class createhashmap2 {
    public static void main(String[] args) {
        // Create a HashMap with Student ID as key and Name as value
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Insert 10 key-value pairs into the map
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eve");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");

        // Fetch the value of a Key
        System.out.println("Student with ID 103: " + studentMap.get(103));

        // Create a clone/copy of the HashMap
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) studentMap.clone();
        System.out.println("Cloned map: " + clonedMap);

        // Check if the given Key is in the Map
        if (studentMap.containsKey(102)) {
            System.out.println("Key 102 is present in the map");
        }

        // Check if the value is in the Map
        if (studentMap.containsValue("Charlie")) {
            System.out.println("Charlie is present in the map");
        }

        // Check if the map is empty
        if (studentMap.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            System.out.println("Map is not empty");
        }

        // Print the size of the Map
        System.out.println("Size of the map: " + studentMap.size());

        // Print all the Keys of the map
        System.out.println("Keys in the map: " + studentMap.keySet());

        // Print all the Values of the map
        System.out.println("Values in the map: " + studentMap.values());

        // Remove a specific Key-value pair
        studentMap.remove(105);
        System.out.println("After removal of Key 105: " + studentMap);

        // Copy all elements of the map to another map
        HashMap<Integer, String> newMap = new HashMap<>(studentMap);
        System.out.println("New Map after copying: " + newMap);
    }
}

