 import java.util.*;;
 class Throw {
    void f1(int x,int y) throws ArithmeticException
    {
        int a;
        if (y==0)
        {
            throw new ArithmeticException("user define error");
        }
        else
        a=x/y;
        System.out.println("Result is"+a);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            Throw ob=new Throw();
            int no1,no2,res;
            System.out.println("Enter the first value");
            no1=sc.nextInt();
            System.out.println("Enter the second value");
            no2=sc.nextInt();
            ob.f1(no1,no2);
            

        }
        catch(Exception ob)
        {
            System.out.println("Cannot divide by zero");
            System.out.println(ob);
        }
    }
}

