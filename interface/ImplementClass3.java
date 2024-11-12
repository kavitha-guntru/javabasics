interface MethodInterface {
    void showMessage();
}

class ImplementClass3 implements MethodInterface {
    @Override
    public void showMessage() {
        System.out.println("Interface method called via interface instance.");
    }
    public static void main(String[] args) {
        MethodInterface obj = new ImplementClass3();
        obj.showMessage();
    }
}

