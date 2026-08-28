import java.util.*;

public class min {

    public static int findMin(ArrayList<Integer> arr) {

        int st = 0;
        int end = arr.size() - 1;
        int ans = Integer.MAX_VALUE;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            // Left half is sorted
            if (arr.get(st) <= arr.get(mid)) {

                ans = Math.min(ans, arr.get(st));
                st = mid + 1;
            }

            // Right half is sorted
            else {

                ans = Math.min(ans, arr.get(mid));
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(
            Arrays.asList(4, 5, 6, 7, 0, -2, 2)
        );

        System.out.println(findMin(arr));
    }
}