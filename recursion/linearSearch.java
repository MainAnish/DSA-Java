public class linearSearch {
    public static void main(String args[]){
        int a[]={1,2,3,5,8};
        int target=5;
        System.out.println(search(a, target, 0));
    }
    public static int search(int a[],int target,int i)
    {
        if(i==a.length){
            return -1;
        }
        if(a[i]==target)
        {
            return i;
        }
        return search(a,target,i+1);
    }
}
