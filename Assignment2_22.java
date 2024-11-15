import java.util.Scanner;

class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}
public class Assignment2_22 {
    public static int add(int a, int b) throws CustomArithmeticException {
        if (a > 0 && b > 0 && (Integer.MAX_VALUE - a < b)) {
            throw new CustomArithmeticException("Addition overflow occurred.");
        }
        return a + b;
    }
    public static int divide(int a, int b) throws CustomArithmeticException {
        if (b == 0) {
            throw new CustomArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        try {
            int sum = add(num1, num2);
            int division = divide(num1, num2);

            System.out.println("Sum: " + sum);
            System.out.println("Division: " + division);
        } catch (CustomArithmeticException e) {
            System.out.println("Caught CustomArithmeticException: " + e.getMessage());
        }
    }
}