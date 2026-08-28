public class countZ {
    public static void main(String args[])
    {
    int a=120450400;
    System.out.println(c(a));
    }
    public static int c(int n)
    {
        if(n<10)
        {
            return 0;
        }
        if (n%10==0)
        {
            return 1+c(n/10);
        }
        return c(n/10);
    }
    
}
