
import java.util.*;

public class twoSum2
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
        Arrays.sort(a);
        int s=0;
        int e=a.length-1;
        while (s < e) {

            if (a[s] + a[e] == t) {
                b[0] = s;
                b[1] = e;
                break;
            }
            else if (a[s] + a[e] > t) {
                e--;
            }
            else {
                s++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
