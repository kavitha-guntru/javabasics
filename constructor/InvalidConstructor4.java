package constructor;
public class InvalidConstructor4 {
    int InvalidConstructor() {
        System.out.println("This is not a constructor; it's a method returning int");
        return 0;
    }
    String InvalidConstructor(String text) {
        System.out.println("This is not a constructor; it's a method returning String");
        return text;
    }
    public static void main(String[] args) {
        InvalidConstructor4 obj = new InvalidConstructor4();
        obj.InvalidConstructor(); 
        obj.InvalidConstructor("Hello"); 
    }
}

