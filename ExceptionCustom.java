class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionCustom {
    public static void main(String[] args) {
        try {
            // Throw custom exception with your own message
            throw new CustomException("This is my custom exception message");
        } catch (CustomException e) {
            // Catch the custom exception and print the message
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
