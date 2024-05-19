import java.util.*;;
class ParentExcep {
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
            int arr[]=new int[10];
            int a,b;
            System.out.println("Enter the Index and element");
            b=sc.nextInt();
            a=sc.nextInt();
            arr[b]=a;
            System.out.println("Anshuman");

        }
        /*catch(NullPointerException ob)
        {
            System.out.println("Cannot divide by zero");
            System.out.println(ob);
        }*/
        catch(ArithmeticException ob)
        {
            System.out.println("cannot divide by 0");
        }
        catch(Exception ob)
        {
            System.out.println(ob);
        }
}
}