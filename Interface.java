import java.util.Scanner;
interface In
{
    void input();
    void display();
}
class c1 implements In{
    int a;
    public void input()
    {
        System.out.println("Value Daunu Maghia : ");
        Scanner sc =new Scanner(System.in);
        a=sc.nextInt();
    }
    public void  display()
    {
        System.out.println("Value = "+a);
    }
}
public class Interface {
    public static void main(String[] args) {
        c1 ob = new c1();
        ob.input();
        ob.display();
    }
    
}
