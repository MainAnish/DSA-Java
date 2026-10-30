import java.util.Scanner;

class MyStack {
    int[] arr;
    int top;
    int capacity;

    MyStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = data;
        System.out.println(data + " pushed");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + arr[top--]);
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element: " + arr[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int size() {
        return top + 1;
    }
}

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack capacity: ");
        int capacity = sc.nextInt();

        MyStack s = new MyStack(capacity);

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
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
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Stack size: " + s.size());
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
