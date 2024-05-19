import java.util.*;;
class MultiCatch {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int no1,no2,res;
            System.out.println("Enter the first value");
            no1=sc.nextInt();
            System.out.println("Enter the second value");
            no2=sc.nextInt();
            res=no1/no2;
            System.out.println("Result is"+res);

        }
        catch(NullPointerException ob)
        {
            System.out.println("Cannot divide by zero");
            System.out.println(ob);
        }
        catch(ArithmeticException ob)
        {
            System.out.println("cannot divide by 0");
        }
}
}
