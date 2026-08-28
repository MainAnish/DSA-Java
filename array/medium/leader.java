import java.util.*;

public class leader {

    public static void main(String[] args) {

        int a[] = {10, 7, 5, 8, 11, 9};
        int n = a.length;

        List<Integer> c = leader(a, n);

        System.out.println(c);
    }

    public static List<Integer> leader(int[] a, int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int m = a[i];
            int j = i + 1;
            int c = 0;

            while (j < n) {

                if (m < a[j]) {
                    c++;
                }

                j++;
            }

            if (c == 0) {
                list.add(a[i]);
            }
        }

        return list;
    }
}