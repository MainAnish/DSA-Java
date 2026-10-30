
import java.util.*;

public class BuildQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

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
                    q.offer(value);
                    break;

                case 2:
                    if (q.isEmpty())
                        System.out.println("Queue is empty");
                    else
                        System.out.println("Removed: " + q.poll());
                    break;

                case 3:
                    System.out.println(
                        q.isEmpty() ? "Queue is empty" : "Front: " + q.peek()
                    );
                    break;

                case 4:
                    System.out.println("Queue: " + q);
                    break;

                case 5:
                    System.out.println("Size: " + q.size());
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
