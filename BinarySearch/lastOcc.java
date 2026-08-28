public class lastOcc {
    public int last(int[] a, int target){
        int n=a.length,s=-1;
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]==target){
                s=mid;
                st=mid+1;
            }
            if(a[mid]>target){
                end=end-1;
            }
            else{
                st=mid+1;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int a[]={3,4,13,13,13,20,24};
        int target=20;
        lastOcc ob=new lastOcc();
        int s=ob.last(a,target);
        System.out.println(s);
    }
    
}
