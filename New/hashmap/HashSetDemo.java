
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        // 1. Insert elements
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            set.add(in.nextInt());
        }

        System.out.println("HashSet: " + set);

        // 2. Check element
        System.out.print("Enter element to search: ");
        int key = in.nextInt();
        System.out.println("Exists: " + set.contains(key));

        // 3. Size
        System.out.println("Size: " + set.size());

        // 4. Check empty
        System.out.println("Is empty: " + set.isEmpty());

        // 5. Traverse elements
        System.out.println("All elements:");
        for (int x : set) {
            System.out.println(x);
        }

        // 6. Remove element
        System.out.print("Enter element to remove: ");
        key = in.nextInt();
        System.out.println("Removed: " + set.remove(key));
        System.out.println("After removal: " + set);

        // 7. Add another element
        System.out.print("Enter element to add: ");
        key = in.nextInt();
        System.out.println("Added: " + set.add(key));
        System.out.println("After adding: " + set);

        // 8. Convert to array
        Integer[] arr = set.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(arr));

        // 9. Clear the set
        System.out.print("Clear set? (true/false): ");
        boolean clear = in.nextBoolean();

        if (clear) {
            set.clear();
        }

        System.out.println("Final HashSet: " + set);
        in.close();
    }
}
