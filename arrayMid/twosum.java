
import java.util.*;

public class twosum {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the element");
        for(int i=0;i<5;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the target:");
        int b[]=new int[2];
        int t=in.nextInt();
        for(int i=0;i<5;i++){
            int s=a[i];
            for(int j=i+1;j<5;j++)
            {
                int e=a[j];
                if(s+e==t)
                {
                    b[0]=i;
                    b[1]=j;
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
