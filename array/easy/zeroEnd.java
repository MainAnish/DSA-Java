public class zeroEnd {
    public static void main(String args[])
    {
        int a[]={2,0,3,0,4,0,89};
        int l=a.length;
        check(a,l);
    }
    public static void check(int[] a,int l)
    {
        int c=0;
        int b[]=new int[l];
        for(int i=0;i<l;i++)
        {
            if(a[i]!=0)
            {
                b[c]=a[i];
                c++;
            }
        }
        for(int i=0;i<l;i++)
        {
        System.out.println(b[i]);
        }
    }
}
