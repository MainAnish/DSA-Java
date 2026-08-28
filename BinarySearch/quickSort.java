public class quickSort {

    // Partition function
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];

        int i = low;
        int j = high;

        while (i < j) {

            // Move i until element > pivot
            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }

            // Move j until element <= pivot
            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }

            // Swap arr[i] and arr[j]
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Put pivot at its correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }


    // Quick Sort function
    static void quickSort(int[] arr, int low, int high) {

        // Base condition
        if (low < high) {

            // Find correct position of pivot
            int pIndex = partition(arr, low, high);

            // Sort left side
            quickSort(arr, low, pIndex - 1);

            // Sort right side
            quickSort(arr, pIndex + 1, high);
        }
    }


    // PSVM
    public static void main(String[] args) {

        int[] arr = {4, 6, 2, 5, 9, 10, 1, 3};

        // Call Quick Sort
        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}