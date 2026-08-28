import java.util.*;

public class CheckOdd {
    public static boolean checkBit(int n) {
        int s=1 << 0;
        if((n & s)==1)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        boolean result = checkBit(n);

        System.out.println(result);

        sc.close();
    }
}
