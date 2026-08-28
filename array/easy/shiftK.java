public class shiftK {
    public static void main(String args[])
    {
        int a[]={2,2,3,4,4,78,89};
        int l=a.length;
        char d='r';
        int k=3;
        shiftK sol=new shiftK();
        sol.check(a,l,k,d);
    }
    public void check(int[] a,int l,int k,char d)
    {
        if(d=='l')
{
    for(int j=0;j<k;j++)
        {
            int temp=a[0];
        for(int i=1;i<a.length;i++)
        {
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
        System.out.println(a[i]);
        }
}
else if(d=='r')
{
for(int j = 0; j < k; j++)
{
    int temp = a[a.length - 1];

    for(int i = a.length - 1; i > 0; i--)
    {
        a[i] = a[i - 1];
    }

    a[0] = temp;
}

for(int i = 0; i < a.length; i++)
{
    System.out.println(a[i]);
}
}
        
    }

}
