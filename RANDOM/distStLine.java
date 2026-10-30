import java.util.*;
public class distStLine 
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x1,x2,y1,y2;
        double p=0,d=0;
        System.out.println("Enter the first co-ordinates:");
        x1=in.nextInt();
        y1=in.nextInt();
        System.out.println("Enter the second co-ordinates");
        x2=in.nextInt();
        y2=in.nextInt();
        p=Math.pow((y2-y1),2)+Math.pow((x2-x1),2);
        System.out.println(p);
        d=Math.sqrt(p);
        System.out.println("The Distance between two points:"+d);
    }
    
}
