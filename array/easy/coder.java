package array.easy;
import java.util.Scanner;

public class coder
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number  to be searched :");
        int s=in.nextInt();
        boolean f=false;
        int[] a=new int[5];
        System.out.println("Enter 5 element:");
        for (int i = 0; i < 5; i++) {
            a[i]=in.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            if(a[i]==s)
            {
                f=true;
            }
        }
        System.out.println("Is no. found: "+f);
    }
}