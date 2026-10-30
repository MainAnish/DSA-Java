import java .util.*;
class BankAccount {
    int accountNumber;
    String name;
    int balance;
    final int minBalance=500;

    public BankAccount(int accountNumber,String name,int balance)
    {
        this.accountNumber=accountNumber;
        this.name=name;
        this.balance=balance;
    }
    public void balance()
    {
        System.out.println("Balance of the account"+balance);
    }
    private int checkMinBalance(int amount)
    {
        int s=balance-amount;
        if (s<minBalance)
        {
            System.out.println("The Balance is low|| Invalid Transaction");
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public void deposit(int amount)
    {
        balance=balance+amount;
        balance();
    }
    public void withdraw(int amount)
    {
        int d=checkMinBalance(amount);
        if(d==1)
        {
            balance=balance-amount;
        }
        balance(); 
    }
}
public class AccountCheck
{
    public static void main(String args[])
    {
        int amount =0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the account number:");
        int accNo=in.nextInt();
        System.out.println("Enter the name of the account holder:");
        String name=in.next();
        System.out.println("Enter the balance of the account:");
        int bal=in.nextInt();
        BankAccount out=new BankAccount(accNo, name, bal);
        System.out.println("Enter w for withdrawal");
        System.out.println("Enter d for deposit");
        System.out.println("Enter the choice:");
        String ch=in.next();
        if (ch.equals("w"))
        {
            System.out.println("Enter the amount to be withdrawn:");
            amount=in.nextInt();
            out.withdraw(amount);
        }
        else if(ch.equals("d"))
        {
            System.out.println("Enter the amount to be deposited:");
            amount=in.nextInt();
            out.deposit(amount);
        }
        else
        {
            System.out.println("The user has given the invalid input::ERROR");
        }


    }
}
