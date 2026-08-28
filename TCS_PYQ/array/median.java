
import java.util.*;

public class median {
    public static void main(String[] args) {
        int a[]={12,10,32,21,54};
        int n=a.length;
        double median=0.0;
        Arrays.sort(a);
        if(n%2==1){
            median=a[n/2];
        }
        else
        {
            median=(a[n/2]+a[n/2-1])/2;
        }
        System.out.println(median);
    }
}
