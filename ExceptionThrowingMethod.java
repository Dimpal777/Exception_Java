public class ExceptionThrowingMethod {

    // Method that throws an exception
    public static void myMethod() {
        int dividend = 10;
        int divisor = 4;
        int result = dividend / divisor; // Potential division by zero
        System.out.println("Result: " + result);
    }

    // Main method calling the method without try-catch block
    public static void main(String[] args) {
        myMethod(); // Calling the method that throws an exception
    }
}
