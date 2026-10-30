import java.util.*;
public class BookFair {
    String Bname;
    double price;
    double dis=0.0,amt=0.0;
    Scanner in= new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the name of the store");
        Bname=in.nextLine();
        System.out.println("Enter the price of the book:");
        price=in.nextDouble();
    }
    void calculate()
    {
        if(price<=1000)
        {
            dis=price*0.02;
        }
        if(price>1000 && price<=3000)
        {
            dis=price*0.1;
        }
        if(price>3000)
        {
            dis=price*0.15;
        }
        amt=price-dis;
    }
    void display()
    {
        System.out.println("Name of the book:"+Bname);
        System.out.println("Price:"+price);
        System.out.println("Discout:"+dis);
        System.out.println("Discount Price:"+amt);
    }
    public static void main(String args[])
    {
        BookFair ob=new BookFair();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
