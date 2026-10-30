
import java.io.*;

public class rd {
    public static void main(String[] args)throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the no of eements in the array:");
        n=Integer.parseInt(in.readLine());
        int a[]=new int[n];
        System.out.println("Enter the elements in the array for" + n +" times:");
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(in.readLine());
        }
        duplicate(int a;int n);
    }
    public void duplicate(int[] s;int n)
    {
        int[] a=new int[n];

        int a,k,c,d;
        k=1;
        while(k<10)
        {
            c=s[k];
            for(int i=k;i<n;i++)
            {
                if(c==s[k])
                {
                    d++;
                }
            }
            if(d>1)
                {
                    continue;
                }
                else
                {
                    a[k]=c;

                }
            c=0;
            d=0;
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}
