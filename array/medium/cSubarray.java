public class cSubarray {
    public static void main(String[] args) {
        int a[]={1,2,3,1,2};
        int k=3,c=0;
        for(int i=0;i<a.length;i++){
            int s=0;
            for(int j=i;j<a.length;j++){
                s=s+a[j];
                if(s==k){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
