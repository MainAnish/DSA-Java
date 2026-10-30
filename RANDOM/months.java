import java.io.*;
public class months
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a;
        System.out.println("Enter the number:");
        a=Integer.parseInt(in.readLine());
        if((a%4==0 && a%100!=0)||(a%400==0))
        {
            System.out.println(a+" is a leap year");
        }
        else
        {
            System.out.println(a+" is not a leap year");
        }
    }
}