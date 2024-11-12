package methodoverloading;
class InvalidExample5 {
    int calculate(int a) {
        return a * 2;
    }
    String calculate(double a) {
        return "Result: " + (a * 2);
    }
    public static void main(String[] args) {
        InvalidExample5 obj = new InvalidExample5();
        System.out.println(obj.calculate(10));      
        System.out.println(obj.calculate(10.5));    
    }
}
