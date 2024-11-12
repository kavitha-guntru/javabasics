package accessmodifiers;
public class AccessPackage4 {
    public static void main(String[] args) {
        PublicClass4 obj = new PublicClass4();
        System.out.println("Accessing public field in same package: " + obj.publicField);
        obj.publicMethod();
    }
}
