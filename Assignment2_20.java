public class Assignment2_20 {


        public static void main(String[] args) {

            try {

                int[] arr = new int[-5];  // This will throw NegativeArraySizeException
            } catch (NegativeArraySizeException e) {
                System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
            }
    

            try {
                // Attempt to divide by zero
                int result = 10 / 0;  // This will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }
        }
    }

