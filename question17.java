import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Compute LCM
        int lcm = findLCM(num1, num2);

        // Output the result
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Method to find LCM using HCF
    public static int findLCM(int a, int b) {
        return (a * b) / findHCF(a, b);
    }

    // Method to find HCF using the Euclidean algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
//OUTPUT
// Enter the first number: 
// 6
// Enter the second number: 9
// The LCM of 6 and 9 is: 18
