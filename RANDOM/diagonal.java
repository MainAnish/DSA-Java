import java.io.*;
public class diagonal
{
    public static void main(String args[]) throws IOException
    {
        int l,b,h;
        double d=0;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the length of the cuboid:");
        l=Integer.parseInt(in.readLine());
        System.out.println("Enter the breadth of the cuboid:");
        b=Integer.parseInt(in.readLine());
        System.out.println("Enter the height of the cuboid:");
        h=Integer.parseInt(in.readLine());
        d=Math.sqrt(l*l+b*b+h*h);
        System.out.println("Diagonal of the cuboid:"+d);
    }
}