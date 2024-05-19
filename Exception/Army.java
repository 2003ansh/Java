import java.util.*;
class TooOldException extends Exception
{
    public TooOldException(String str)
    {
        System.out.println(str);
    }
}
class TooYoungException extends Exception
{
    public TooYoungException(String str)
    {
        System.out.println(str);
    }
}
class Army {
    int age;
    void checkage(int x) throws TooOldException, TooYoungException
    {
        if(x>28)
        {
            throw new TooOldException("");
        }
        else if(x<18)
        {
            throw new TooYoungException("Too young Exception");
        }
        else if(x>18&&x<28)
        {
            System.out.println("Congratukation u are eligible");
        }

    }
    public static void main(String args[])
    {
        try{
            Scanner sn=new Scanner(System.in);
        int a;
        System.out.println("Enter the age:");
        a=sn.nextInt();
        Army ob=new Army();
        ob.checkage(a);
        }
        catch(Exception ob)
        {
            System.out.println(ob);
        }
        
    }
    
}
