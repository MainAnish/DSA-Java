
import java.util.Scanner;

public class daySwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int ch=0;
        System.out.println("Enter 1 for monday;2 for tuesday;and so on:");
        System.out.println("Enter the choice:");
        ch=in.nextInt();
        switch(ch)
        {
            case 1 :System.out.println("Monday");
            break;
            case 2 :System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thrusday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            case 7:System.out.println("Sunday");
            break;
            default:System.out.println("Wrong choice");
            break;
        }
    }
    
}
