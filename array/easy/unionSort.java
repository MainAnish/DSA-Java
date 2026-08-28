

public class unionSort {
    public static void main(String args[])
    {
        int a[]={1,3,5,5,7};
        int l=a.length;
        int b[]={2,4,6,8,10};
        int s=b.length;
        check(a,b,l,s);
    }
    public static void check(int[] a, int[] b, int l, int s)
{
    int x = 0, y = 0, i = 0;
    int[] c = new int[l+s];

    while(x < l && y < s)
    {
        if(a[x] < b[y])
        {
            c[i++] = a[x++];
        }
        else if(a[x] > b[y])
        {
            c[i++] = b[y++];
        }
        else
        {
            c[i++] = a[x];
            x++;
            y++;
        }
    }

    while(x < l)
    {
        c[i++] = a[x++];
    }

    while(y < s)
    {
        c[i++] = b[y++];
    }

    for(int j = 0; j < i; j++)
    {
        System.out.println(c[j]);
    }
}
}
