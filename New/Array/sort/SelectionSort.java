package Array.sort;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = in.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        
        System.out.println("Original Array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println(); // Moves to a new line
        
        selection_sort(a, n);
    }
    public static void selection_sort(int a[],int n){
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
        System.out.println("Sorted Array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
