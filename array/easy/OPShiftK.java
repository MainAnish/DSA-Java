public class OPShiftK {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        char d = 'l';

        rotate(a, k, d);

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void rotate(int a[], int k, char d) {

        int n = a.length;

        k = k % n;

        if(d == 'l') {

            // Left Rotation
            reverse(a, 0, k - 1);
            reverse(a, k, n - 1);
            reverse(a, 0, n - 1);

        }
        else if(d == 'r') {

            // Right Rotation
            reverse(a, 0, n - 1);
            reverse(a, 0, k - 1);
            reverse(a, k, n - 1);
        }
    }

    public static void reverse(int a[], int start, int end) {

        while(start < end) {

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }
}