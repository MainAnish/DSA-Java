
import java.util.Scanner;
import java.util.Stack;

public class BuildStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();

        while (true) {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Size");
            System.out.println("6. Search");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    s.push(value);
                    break;

                case 2:
                    if (s.isEmpty())
                        System.out.println("Stack is empty");
                    else
                        System.out.println("Popped: " + s.pop());
                    break;

                case 3:
                    if (s.isEmpty())
                        System.out.println("Stack is empty");
                    else
                        System.out.println("Top: " + s.peek());
                    break;

                case 4:
                    System.out.println("Stack: " + s);
                    break;

                case 5:
                    System.out.println("Size: " + s.size());
                    break;

                case 6:
                    System.out.print("Enter value to search: ");
                    int target = sc.nextInt();

                    if (s.search(target) == -1)
                        System.out.println("Not found");
                    else
                        System.out.println(
                            "Position from top: " + s.search(target)
                        );
                    break;

                case 7:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
