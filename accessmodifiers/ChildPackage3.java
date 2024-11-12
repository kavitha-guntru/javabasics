package accessmodifiers;
public class ChildPackage3 extends ProtectedClass3 {
    public void accessProtectedMembers() {
        System.out.println("Accessing protected field in subclass: " + protectedField);
        protectedMethod();
    }

    public static void main(String[] args) {
        ChildPackage3 obj = new ChildPackage3();
        obj.accessProtectedMembers();
    }
}

