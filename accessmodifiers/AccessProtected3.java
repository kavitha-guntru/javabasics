package accessmodifiers;
public class AccessProtected3 {
    public static void main(String[] args) {
        ProtectedClass3 obj = new ProtectedClass3();
        System.out.println("Accessing protected field: " + obj.protectedField);
        obj.protectedMethod();
    }
}
