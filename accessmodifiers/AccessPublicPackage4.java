package accessmodifiers;
public class AccessPublicPackage4 {
    public static void main(String[] args) {
        PublicClass4 obj = new PublicClass4();
        System.out.println("Accessing public field in different package: " + obj.publicField);
        obj.publicMethod();
    }
}

