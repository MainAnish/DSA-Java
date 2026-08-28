import java.util.*;
public class maxele
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int[] a= new int[5];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        max(a);
    }
    public static void max(int[] a)
    {
        int max=a[0];
        for(int i=1;i<5;i++)
        {
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("Maximum Element:"+max);
    }
}