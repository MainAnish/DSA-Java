public class rearranger {
    public static void main(String[] args) {
        int a[][]={{1,2,3,6},{4,5,6,7},{7,8,9,8}};
        System.out.println("Matrix is:");
        int l=a.length;
        int b=a[0].length;
        for(int i=0;i<l;i++){
            for(int j=0;j<b;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<b;i++){
            System.out.println(a[0][i]);
        }
        for(int i=1;i<l;i++){
            System.out.println(a[i][b-1]);
        }
        for(int i=b-2;i>=0;i--){
            System.out.println(a[l-1][i]);
        }
        for(int i=l-2;i>0;i--){
            System.out.println(a[i][0]);
        }
    }
    
}
