import java.util.HashMap;
import java.util.Scanner;

public class countelement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        int a[]={23,21,45,45,34};
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
        }
        System.out.println("frequency is"+map);
    }
}
