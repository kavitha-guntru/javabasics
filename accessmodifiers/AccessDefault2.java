package accessmodifiers;
public class AccessDefault2 {
    private String defaultField;
    
        public static void main(String[] args) {
            AccessDefault2 obj = new AccessDefault2();
            System.out.println("Accessing default field: " + obj.defaultField);
        obj.defaultMethod();
            }
        
            private void defaultMethod() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'defaultMethod'");
            }
}