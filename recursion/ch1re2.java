public class ch1re2 {
    public static void main(String args[])
    {
        print(10);
    }
    static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
