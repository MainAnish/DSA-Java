public class OPzeroend {
    public static void main(String args[])
    {
        int a[]={2,0,3,0,4,0,89};
        int l=a.length;
        check(a,l);
    }
public static void check(int[] a, int l)
    {
        int j = 0;

        for(int i = 0; i < l; i++)
        {
            if(a[i] != 0)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                j++;
            }
        }

        for(int i = 0; i < l; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
