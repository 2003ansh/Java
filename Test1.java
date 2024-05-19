import java.util.Scanner;

class Inheritance {
    String name;
    int age;
    Inheritance(String x,int y)
    {
        name=x;
        age=y;
        System.out.println("I am inside parent class");
    }
    void show()
    {
        System.out.println("Name is ="+name+"\tAge is="+age);
    }
}
class Test extends Inheritance
{
    Test(String a,int b)
    {
        super(a,b);
        System.out.println("Single Inheritance");
    }

}
class Test2 extends Test
{
    Test2(String g,int h)
    {
        super(g,h);
        System.out.println("Multilevel Inheritance");
    }
}
class Test3 extends Inheritance
{
    Test3(String k,int l)
    {
        super(k,l);
        System.out.println("Hireichal");
    }
}
public class Test1 {
    public static void main(String[] args)
    {
        String a;
        int b;
        Scanner imp =new Scanner(System.in);
        System.out.println("Enter name and age:");
        a=imp.next();
        b=imp.nextInt();
        Test ob1=new Test(a, b);
        Test3 ob=new Test3(a,b);
        Test2 ob2=new Test2(a,b);
        ob.show();

    }
    
}

