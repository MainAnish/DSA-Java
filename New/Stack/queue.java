import java.util.Scanner;

class MyQueue {
    int[] arr;
    int front;
    int rear;
    int capacity;
    int size;

    MyQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;

        System.out.println(data + " inserted");
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Removed: " + arr[front]);
        front = (front + 1) % capacity;
        size--;
    }

    void peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front element: " + arr[front]);
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }

        System.out.println();
    }

    int getSize() {
        return size;
    }
}

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue capacity: ");
        int capacity = sc.nextInt();

        if (capacity <= 0) {
            System.out.println("Capacity must be positive");
            sc.close();
            return;
        }

        MyQueue q = new MyQueue(capacity);

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Size");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    q.enqueue(value);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    System.out.println("Queue size: " + q.getSize());
                    break;

                case 6:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
