import java.util.*;
public class smallLar {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no. of terms:");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the number of elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int min=a[0];
        int secondmin=0;
        for(int i=1;i<n;i++){
            if(min>a[i]){
                secondmin=min;
                min = a[i];
            }
        }
        int max=a[0];
        int secondmax=0;
        for(int i=1;i<n;i++){
            if(min<a[i]){
                secondmax=max;
                max = a[i];
            }
        else if (a[i] > secondmax){
            secondmax = a[i];
        }
        }
        System.out.println("Minimum No in an Array:"+min);
        System.out.println("Second minimum No in an array:"+secondmin);
        System.out.println("Maximum No in an Array:"+max);
        System.out.println("Second maximum No in an array:"+secondmax);
        in.close();
    }
}
