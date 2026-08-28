import java.util.*;
public class stick{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the stack length:");
        int l=sc.nextInt();
        Stack<Integer> in=new Stack<>();
        while (true) { 
            System.out.println("Enter the choice:");
            System.out.println("Enter 1 for Push");
            System.out.println("Enter 2 for Pop");
            System.out.println("Enter 3 for Peek");
            System.out.println("Enter 4 for Display");
            System.out.println("Enter 5 for exit");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter element: ");
                    int x = sc.nextInt();

                    in.push(x);
                    System.out.println(x + " pushed");
                    break;
                case 2:
                    if (in.isEmpty()) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println("Popped: " + in.pop());
                    }
                    break;
                case 3:
                    if (in.isEmpty()) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println("Popped: " + in.peek());
                    }
                    break;
                case 4:
                    if (in.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack: " + in);
                    }
                    break;

                case 5:
                    System.out.println("Program ended");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}