import java.util.*;
public class power2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if(n > 0 && (n & (n - 1)) == 0)
        {
            System.out.println("Power of 2");
        }
        else
        {
            System.out.println("Not a power of 2");
        }

        in.close();
    }
}

