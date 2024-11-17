import java.util.Scanner;

// Custom exception for username validation
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

// Custom exception for password validation
class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class Assignment2_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Input password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Confirm password
        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        try {
            // Validate username and password
            validateUsername(username);
            validatePassword(password, confirmPassword);
            System.out.println("User registered successfully!");
        } catch (InvalidUsernameException | PasswordMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to validate username
    public static void validateUsername(String username) throws InvalidUsernameException {
        if (username.length() < 6) {
            throw new InvalidUsernameException("InvalidUsernameException: Username must be at least 6 characters long.");
        }
    }

    // Method to validate password
    public static void validatePassword(String password, String confirmPassword) throws PasswordMismatchException {
        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("PasswordMismatchException: Passwords do not match.");
        }
    }
}
// OUTPUT
// Enter username: kav
// Enter password: 234
// Confirm password: 234
// InvalidUsernameException: Username must be at least 6 characters long.
