public class o {

    public static int countOccurrences(int[] arr, int x) {
        int first = -1, last = -1;

        // Find first occurrence
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == x) {
                first = mid;
                end = mid - 1;   // search left
            }
            else if (arr[mid] < x) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        if (first == -1) {
            return 0;
        }

        // Find last occurrence
        st = 0;
        end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == x) {
                last = mid;
                st = mid + 1;    // search right
            }
            else if (arr[mid] < x) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return last - first + 1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 2, 2, 3};
        int x = 3;

        int result = countOccurrences(arr, x);

        System.out.println("Occurrences of " + x + " = " + result);
    }
}