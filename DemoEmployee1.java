import java.util.*;
class Employee1{
    String name;
    int Salary;
    int age;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        Salary=sc.nextInt();
        age=10;
    }
    void show()
    {
        System.out.println("Name = "+name);
        System.out.println("Salary = "+Salary);
        System.out.println("Age = "+age);
    }
    void show(int a)
    {
        System.out.println("maghiia = "+a);
    }
}
class Anshuman extends Employee1
{
}
class DemoEmploypee1
{

    public static void main(String[] args) {
    Anshuman ans = new Anshuman();
    ans.input();
    ans.show();
    ans.show(89);
    }
}
