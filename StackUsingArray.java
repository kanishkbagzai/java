import java.util.Scanner;

public class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public StackUsingArray(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Push method to add an element to the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + element);
            return;
        }
        stack[++top] = element;
        System.out.println("Pushed " + element + " into the stack.");
    }

    // Pop method to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        return stack[top--];
    }

    // Peek method to view the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a stack with a given size
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        StackUsingArray stack = new StackUsingArray(size);

        // Menu-driven program to perform stack operations
        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
