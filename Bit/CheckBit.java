import java.util.Scanner;

public class CheckBit {

    public static boolean checkBit(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        System.out.print("Enter bit position i: ");
        int i = sc.nextInt();

        boolean result = checkBit(n, i);

        System.out.println(result);

        sc.close();
    }
}