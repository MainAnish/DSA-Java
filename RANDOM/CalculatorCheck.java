import java.util.*;
class Calculator {
    public void add(double a,double b)
    {
        double add=a+b;
        System.out.println("Addition of two numbers:"+add);
    }
    public void sub(double a,double b)
    {
        double sub=a-b;
        System.out.println("Subtraction of two numbers:"+sub);
    }
    public void  mul(double a,double b)
    {
        double mul=a*b;
        System.out.println("Multiplication of two numbers:"+mul);
    }
    public void div(double a,double b)
    {
        double div=a/b;
        System.out.println("Division of two numbers:"+div);
    }
}
class UpdatedCalculator extends Calculator
{
    public void modulo(double a,double b)
    {
        double m=a%b;
        System.out.println("Modulus of number is "+m);
    }
}
public class CalculatorCheck
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value1:");
        double a=in.nextDouble();
        System.out.println("Enter the second value2:");
        double b=in.nextDouble();
        Calculator c=new Calculator();
        c.add(a,b);
        c.sub(a,b);
        c.mul(a,b);
        c.div(a,b);
        UpdatedCalculator uc=new UpdatedCalculator();
        uc.modulo(a,b);
    }
}
