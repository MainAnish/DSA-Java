import java.util.*;

public class smallest {
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
        int min=a[0];
        for(int i=1;i<n;i++){
            min=Math.min(min,a[i]);
        }
        System.out.println("Minimum No in an Array:"+min);
        in.close();
    }
}
