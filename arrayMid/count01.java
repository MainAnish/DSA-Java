import java.util.*;
public class count01 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a[]={1,0,1,1,0,2,0};
        int c1=0,c2=0,c3=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                c1++;
            }
            else if(a[i]==1)
            {
                c2++;
            }
            else if(a[i]==2)
            {
                c3++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (i < c1) {
                a[i] = 0;
            }
            else if (i < c1 + c2) {
                a[i] = 1;
            }
            else {
                a[i] = 2;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
