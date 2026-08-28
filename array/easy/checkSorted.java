public class checkSorted {
    public static void main(String args[])
    {
        int a[]={2,2,3,4,4,78,89};
        int l=a.length;
        check(a,l);
    }
    public static void check(int a[],int l)
    {
        int b[]=new int[l];
        b[0]=a[0];
        int c=0;
        for(int i=0;i<l;i++)
        {
            if(b[c]!=a[i])
            {
                b[c+1]=a[i];
                c=c+1;
            }
        }
        for(int i=0;i<l;i++){
            a[i]=b[i];
        }
        for(int i=0;i<l;i++){
            System.out.println(a[i]);
        }
    }
    
}
