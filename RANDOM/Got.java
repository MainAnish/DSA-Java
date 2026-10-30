public class Got
{
    static int age;
    static String name;

    public static void set(int a,String n)
    {
        age = a;
        name = n;
    }
    public static  void get()
    {
        System.out.println("age:"+age);
        System.out.println("name"+name);
    }
    public static void main(String args[])
    {
        Got.set(16,"Teri maa ka bhosda phatt jagaa");
        Got.get();
    }
}