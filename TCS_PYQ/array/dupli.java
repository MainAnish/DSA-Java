public class dupli {

    public static void main(String[] args) {

        int a[] = {1, 12, 23, 23, 32, 34, 34, 56, 87, 98};
        int l = a.length;

        for (int i = 1; i < l; i++) {

            if (a[i] == a[i - 1]) {
                System.out.println(a[i]);
            }

            while (i < l - 1 && a[i] == a[i + 1]) {
                i++;
            }
        }
    }
}