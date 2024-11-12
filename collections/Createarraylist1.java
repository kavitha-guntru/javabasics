package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Createarraylist1 {
    public static void main(String[] args) {
        // Create an ArrayList of type String
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grapes");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");

        // Add an element to the ArrayList
        list.add("Kiwi");
        Iterator<String> iterator = list.iterator();
        System.out.println("Iterating through the ArrayList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        list.add(2, "Blueberry");
        list.remove("Date");
        list.remove(5);
        list.set(0, "Avocado");
        if (list.contains("Blueberry")) {
            System.out.println("Blueberry is present in the ArrayList");
        }
        System.out.println("Element at index 3: " + list.get(3));
        System.out.println("Size of the ArrayList: " + list.size());
        if (list.contains("Banana")) {
            System.out.println("Banana is present in the ArrayList");
        }
        list.clear();
        System.out.println("ArrayList cleared. Size now: " + list.size());
    }
}

