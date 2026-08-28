import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no. of terms:");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the number of elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
        System.out.println("Reverse array is:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);  
        }
        in.close();
    }
}
