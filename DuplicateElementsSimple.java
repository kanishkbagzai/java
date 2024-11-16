import java.util.Scanner;

public class DuplicateElementsSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find duplicates and their frequency
        System.out.println("Duplicate elements and their frequencies:");
        boolean hasDuplicates = false;

        for (int i = 0; i < size; i++) {
            if (array[i] == -1) {
                continue; // Skip already processed elements
            }
            int count = 1; // Start counting occurrences
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;
                    array[j] = -1; // Mark as processed
                }
            }
            if (count > 1) {
                hasDuplicates = true;
                System.out.println("Element: " + array[i] + ", Frequency: " + count);
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }
}
// OUTPUT
// Enter the size of the array: 5
// Enter the elements of the array:
// 1
// 1
// 33
// 33
// 5
// Duplicate elements and their frequencies:
// Element: 1, Frequency: 2
// Element: 33, Frequency: 2
