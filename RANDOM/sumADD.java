import java.io.*;
public class sumADD {
    public int Add(int m,int n)
    {
        int s=0;
        s=m+n;
        return(s);
    }
    public static void main(String[] args)throws IOException {
        int a,b,p;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter two numbers:");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        sumADD ob = new sumADD();
        p=ob.Add(a,b);
        System.out.println("The Sum of two number:"+p);
    }
}
