package Bit;
public class checkparity {
    public static void main(String args[])
    {
        int a=16;
        if(a>0 && (a & (a-1))==0){
            System.out.println("Perfect Square of 2");
        }
        else {
            System.out.println("False");
        }
    }
}
