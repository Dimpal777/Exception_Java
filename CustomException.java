
public class CustomException{
    // Method that throws custom exception
    public static void myMethod() throws Exception {
        // Throw Exception with a custom message
        throw new Exception("This is a custom exception message.");
    }

    // Main method calling the method that throws custom exception
    public static void main(String[] args) {
        try {
            myMethod(); // Calling method that throws custom exception
        } catch (Exception e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }
}
