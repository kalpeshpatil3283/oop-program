public class OperatorsDemo {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }

    // Method with return
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        // Ariothmetic Promotion
        byte a = 20, b = 30;
        int result = a + b;
        System.out.println("Arithematic Promotion Result: " + result);

        // Operator
        int x =15, y = 5;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        // Method Calling 
        OperatorsDemo obj = new OperatorsDemo();
        obj.add(8, 14);

        int product = obj.multiply(6, 8);
        System.out.println("Multiplication: " + product);
    }
}