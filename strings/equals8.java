package strings;
public class equals8 {
        public static void main(String[] args) {
            String str = "Hello";
            System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase("HELLO"));
            System.out.println("startsWith: " + str.startsWith("He"));
            System.out.println("endsWith: " + str.endsWith("lo"));
            System.out.println("compareTo 'Hello': " + str.compareTo("Hello"));
        }
}
