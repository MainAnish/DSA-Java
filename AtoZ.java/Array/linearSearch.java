
import java.util.*;

public class linearSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range of the array:");
        int n = in.nextInt();
        int a[] = new int[n];
        int s = -1;
        System.out.println("Enter the array:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.print("Enter the target:");
        int t = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == t) {
                System.out.println(i);
                s = t;
                break;
            }
        }
        if (s == -1) {
            System.out.println("-1");
        }
    }
}
