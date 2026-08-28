import java.util.*;
public class aLsmallest {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no. of terms:");
        int n=in.nextInt();
        ArrayList<Integer> ok = new ArrayList<>();
        System.out.println("Enter the number of elements:");
        for(int i=0;i<n;i++)
        {
            int s=in.nextInt();
            ok.add(s);
        }
        int min=ok.get(0);
        for(int i=1;i<n;i++){
            min=Math.min(min,ok.get(i));
        }
        System.out.println("Minimum No in an Array:"+min);
        in.close();
    }
}
