import java.util.Scanner;

public class QueueUsingArray {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    // Constructor to initialize the queue
    public QueueUsingArray(int size) {
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    // Enqueue method to add an element to the queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        System.out.println("Enqueued " + element + " into the queue.");
    }

    // Dequeue method to remove the front element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! No elements to dequeue.");
            return -1;
        }
        int removed = queue[front];
        front = (front + 1) % capacity;
        return removed;
    }

    // Peek method to view the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (rear + 1) % capacity == front && rear == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return (rear + 1) % capacity == front && rear != -1;
    }

    // Display all elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Queue elements:");
        int i = front;
        do {
            System.out.println(queue[i]);
            i = (i + 1) % capacity;
        } while (i != (rear + 1) % capacity);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a queue with a given size
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        QueueUsingArray queue = new QueueUsingArray(size);

        // Menu-driven program to perform queue operations
        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    int dequeued = queue.dequeue();
                    if (dequeued != -1) {
                        System.out.println("Dequeued element: " + dequeued);
                    }
                    break;
                case 3:
                    int frontElement = queue.peek();
                    if (frontElement != -1) {
                        System.out.println("Front element: " + frontElement);
                    }
                    break;
                case 4:
                    queue.display();
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
