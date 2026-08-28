import java.util.*;
public class stck {
    static int[] stk;
    static int top = -1;
    static int n=0;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of stack:");
        n=in.nextInt();
        stk=new int[n];
        while (true) {

            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = in.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element: ");
                    int x = in.nextInt();

                    push(x);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Program ended");
                    in.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public static void push(int x){
            if(top==stk.length-1){
                System.out.println("Stack OverFlow");
                display();
                return;
            }
            top++;
            stk[top]=x;
            System.out.println(x+" is pushed");
        }
    public static void peek(){
            if(top==-1){
                System.out.println("Stack empty");
                return;
            }
            System.out.println("Peek:"+stk[top]);

    }
    public static void pop(){
            if(top==-1){
                System.out.println("Stack Underflow");
                return;
            }
            System.out.println("Pop:"+ stk[top] );
            top--;
    }
    public static void display(){
        if(top==-1){
            System.out.println("Stack empty:");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(stk[i]);
        }
    }
    
}
