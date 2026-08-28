
public class stock {
    public static void main(String[] args) {
        int a[]={10,7,5,8,11,9};
        int n=a.length;
        int s=profit(a,n);
        System.out.println("Profit:"+s);
    }
    public static int profit(int[] a,int n){
        int p=0;
        for(int i=0;i<n-1;i++){
            int c1=a[i];
            for(int j=i+1;j<n-1;j++){
                int c2=a[j];
                if(c1<c2){
                    if((c2-c1)>p){
                        p=c2-c1;
                    }
                }
            }
        }
        return p;
    }
    
}
