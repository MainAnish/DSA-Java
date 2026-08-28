public class checkSort {
    public static void main(String args[])
    {
        int a[]={2,5,11,9,13,23};
        int l=a.length;
        cSort(a,l);
    }
    public static void cSort(int a[],int l)
    {
        int c=0;
        for(int i=0;i<l-1;i++)
        {
            if(a[i]>a[i+1])
            {
                c++;
                break;
            }
        }
        if(c>0)
        {
            System.out.println("Unsorted array");
        }
        else{
            System.out.println("Sorted Array");
        }
    }
    
}
