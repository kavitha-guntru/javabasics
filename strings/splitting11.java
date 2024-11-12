package strings;
public class splitting11 {
        public static void main(String[] args) {
            String str = "Hello World";
            String[] splitArray = str.split(" ");
            System.out.println("Split array:");
            for (String s : splitArray) {
                System.out.println(s);
            }
        }     
}
