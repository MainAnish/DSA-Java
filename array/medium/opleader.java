
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class opleader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> op=new ArrayList<>();
        ArrayList<Integer> s=new ArrayList<>();
        System.out.println("Enter the element in tha list:");
        for(int i=0;i<6;i++){
            int input=in.nextInt();
            op.add(input);
        }
        int l=op.get(5);
        s.add(l);
        for(int i=4;i>=0;i--){
            if(op.get(i)>l){
                s.add(op.get(i));
            }
            l=op.get(i);
        }
        Collections.reverse(s);
        System.out.println(s);
    }
    
}
