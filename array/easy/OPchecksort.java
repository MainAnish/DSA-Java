public class OPchecksort {
    public static void main(String args[])
    {
        int a[]={2,2,3,4,4,78,89};
        int l=a.length;
        check(a,l);
    }
    public static void check(int[] a,int l)
    {
        int temp=a[0];
        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        for(int i=0;i<a.length;i++)
        {
        System.out.println(a[i]);
        }
    }
}
