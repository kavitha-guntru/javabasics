package strings;
public class stringmatching6 {
        public static void main(String[] args) {
            String str = "Hello123";
            boolean matches = str.matches("[A-Za-z0-9]+");
            System.out.println("Does the string match '[A-Za-z0-9]+': " + matches);
        }  
}
