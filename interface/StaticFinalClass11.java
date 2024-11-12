interface StaticFinalInterface {
    static final int MAX_VALUE = 100;
}

class StaticFinalClass11 implements StaticFinalInterface {
    public static void main(String[] args) {
        System.out.println("Static Final Value: " + MAX_VALUE);
    }
}

