import java.util.Scanner;

 class Test 
{
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
        catch(ArithmeticException ob)
        {
            System.out.println("Cannot divide by zero");
            System.out.println(ob);
        }
        try{
            int arr[]=new int[10];
            int a,b;
            System.out.println("Enter the Index and element");
            b=sc.nextInt();
            a=sc.nextInt();
            arr[b]=a;
        }
        catch(ArrayIndexOutOfBoundsException ob)
        {
            System.out.println("u have entered wrong index");
            System.out.println(ob);
        }
        try
        {
            String a;
            a=null;
            System.out.print("length of string is"+a.length());
        }
        catch(NullPointerException ob)
        {
            System.out.println("The string is null");
            System.out.println(ob);
        }
       
        System.out.println("Prgm Over");
    }
    
}
