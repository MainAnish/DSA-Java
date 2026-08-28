public class countSet {
    public static void main(String args[]){
        int n=15,c=0;
        while(n!=0)
        {
            n=n & (n-1);
            c++;
        }
        System.out.println("Count of 1's:"+c);
    }
}
