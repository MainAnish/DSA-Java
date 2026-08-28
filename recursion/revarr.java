
import java.util.Arrays;

public class revarr {
    public static void main(String args[])
    {
        int a[]={1,5,8,2,3};
        int s=0,e=a.length-1;
        System.out.println(Arrays.toString(rev(a,s,e)));
    }
    public static int[] rev(int[] a,int s,int e)
    {
        int temp;
        if(s>=e){
            return a;
        }
            temp=a[s];
            a[s]=a[e];
            a[e]=temp;

        return rev(a, s+1, e-1);
    }
}
