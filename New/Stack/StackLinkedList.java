
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyStack {
    Node top;
    int size;

    MyStack() {
        top = null;
        size = 0;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;

        System.out.println(data + " pushed");
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + top.data);
        top = top.next;
        size--;
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top: " + top.data);
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;
        System.out.print("Stack (top to bottom): ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int getSize() {
        return size;
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack s = new MyStack();

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
                    s.push(sc.nextInt());
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
                    System.out.println("Size: " + s.getSize());
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
