import java.util.*;
class MinimumBalanceException extends Exception
{
    public MinimumBalanceException(String str)
    {
        System.out.println(str);
    }
}
class Account {
    String name;
    int accNumber;
    double accbalance;

    void deposit(int amt,double x)
    {

    }
    double withdraw(int amt,double d) throws MinimumBalanceException
    {
        if(d-amt<500)
        {
            throw new MinimumBalanceException("Balance is less than 500");
        }
        else
        d=d-amt;
        return d;

    }
    public static void main(String[] args) 
    {
        try
        {
            double b,c;
            int a;
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter account balance:");
        b=sn.nextDouble();
        System.out.println("Enter amount to withdraw:");
        a=sn.nextInt();
        Account ob=new Account();
        c=ob.withdraw(a,b);
        System.out.println("The updated balance is:"+c);
    }
    catch(MinimumBalanceException ob)
    {
        System.out.println(ob);
    }
        

    }
    
}
