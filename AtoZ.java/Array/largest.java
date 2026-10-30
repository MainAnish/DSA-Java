
import java.util.*;

public class largest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range of the array:");
        int n = in.nextInt();
        int a[] = new int[n];
        int max = Integer.MIN_VALUE;
        System.out.println("Enter the array:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("Largest number is:"+max);
    }
}
