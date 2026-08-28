public class swap {
    public static void main(String args[]){
        int a=10,b=13;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
