public class Main {
    public static void main(String[] args) {

        // Handling Arithmetic Exception
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: Division by zero is not allowed.");
        }

        // Handling Array Index Out Of Bounds Exception
        try {
            int[] arr = new int[3];  // Array with size 3 (indices 0, 1, 2)
            arr[5] = 10;             // Trying to access index 5
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Index 5 is out of bounds.");
        }
    }
}

/*Output
Arithmetic Exception caught: Division by zero is not allowed.
ArrayIndexOutOfBoundsException caught: Index 5 is out of bounds.
*/