
import java.util.*;

public class twosum3
 {
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
        int n=a.length;
        HashMap<Integer,Integer> op=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int ne=t-a[i];
            if(op.containsKey(ne)){
                b[0]=op.get(ne);
                b[1]=i;
                break;
            }
            op.put(a[i],i);

        }
        System.out.println(Arrays.toString(b));
    }
}
