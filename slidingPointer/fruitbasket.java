import java.util.HashMap;
import java.util.Scanner;

public class fruitbasket {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int l=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0,max=0;
        for(int right=0;right<a.length;right++){
            map.put(a[right],map.getOrDefault(a[right], 0) + 1);
            while(map.size()>2){
                int fruit=a[right];
                map.put(fruit,map.get(fruit)-1);
                if(map.get(fruit)==0){
                    map.remove(fruit);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
    
}
