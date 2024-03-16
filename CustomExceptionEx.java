
// Custom exception class
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

// Example class using the custom exception
public class CustomExceptionEx {
    // Method that may throw the custom exception
    public static void validate(int age) throws MyCustomException {
        if (age < 0) {
            throw new MyCustomException("Age cannot be negative");
        }
        System.out.println("Age is valid.");
    }

    // Main method to demonstrate custom exception
    public static void main(String[] args) {
        try {
            // Call the method with invalid age
            validate(-5);
        } catch (MyCustomException e) {
            // Catch the custom exception and print the message
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
