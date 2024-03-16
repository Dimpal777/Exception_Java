public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 4; // Trying to access an element beyond the array's bounds
            int result = numbers[index]; // Potential ArrayIndexOutOfBoundsException
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds error.");
        } catch (Exception e) {
            
            System.out.println("Arithmetic error.");
        
        }  
        {
            System.out.println("An unexpected error occurred.");
        }
    }
}

