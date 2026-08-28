

public class secMax {
    public static void main(String args[])
    {
        int a[]={22,34,21,38,10};
        int l=a.length;
        sec(a,l);
    }
    public static void sec(int[] a, int l)
    {
        int max=a[0];
        int secM=0;
        for(int i=0;i<5;i++)
        {
            if(a[i]>secM && a[i]<max){
                secM=a[i];
            }
            else if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("Maximum No is:"+max);
        System.out.println("Sec Max No is:"+secM);
    }
    
}
