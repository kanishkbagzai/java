import java.util.Scanner;

public class question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter D for decimal or B for binary:");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("D")) {
            System.out.println("Enter a decimal number: ");
            int decimalNumber = sc.nextInt();
            String binaryString = Integer.toBinaryString(decimalNumber);
            System.out.println("The binary number is: " + binaryString);
        } else if (choice.equalsIgnoreCase("B")) {
            System.out.println("Enter a binary number: ");
            String binaryString = sc.next();
            try {
                int decimalNumber = Integer.parseInt(binaryString, 2);
                System.out.println("The decimal number is: " + decimalNumber);
            } catch (NumberFormatException e) {
                System.out.println("Invalid binary number.");
            }
        } else {
            System.out.println("Invalid choice. Please enter 'D' or 'B'.");
        }
    }
}
//OUTPUT
// Enter D for decimal or B for binary:
// B
// Enter a binary number: 
// 111
// The decimal number is: 7