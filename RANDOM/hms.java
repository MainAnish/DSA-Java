import java.util.*;

public class hms 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        String userid,password;
        int ch;
        System.out.println("WELCOME TO HOSPITAL MANAGEMENT SYSTEM");
        System.out.println("Enter the user id and password for entering the portal:");
        userid=in.next();
        System.out.println("Enter the password for logging in the system:");
        password=in.next();
        System.out.println("welcome to the login page ");
        System.out.println("Welcome user"+userid);
        System.out.println("Enter 1 for admin login portal");
        System.out.println("Enter 2 for doctors admin portal:");
        System.out.println("Enter 3 for patients portal:");
        System.out.println("Enter the choice: ");
        ch=in.nextInt(); 
        switch(ch)
        {
            case 1:
            System.out.println("WELCOME TO ADMIN PORTAL");
            System.out.println("Enter the User Id:");
            int userid1=in.nextInt();
            System.out.println("Enter the password:");
            int password1=in.nextInt();
            break;
            case 2:
            System.out.println("WELCOME TO DOCTOR'S PORTAL");
            System.out.println("Enter the User Id:");
            int userid2=in.nextInt();
            System.out.println("Enter the User Id:");
            int password2=in.nextInt();
            break;
            case 3:
            System.out.println("WELCOME TO PATIENTS'S PORTAL");
            System.out.println("Enter the User Id:");
            int userid3=in.nextInt();
            System.out.println("Enter the User Id:");
            int password3=in.nextInt();
            break;
            default:
            System.out.println("Wrong choice:");

        }
        in.close();
    }
}
