import java.util.*;
class Employee{
    String name;
    int Salary;
    int age;
    Employee()
    {
        Salary=50;
        System.out.println("im inside employee"+Salary);
    }
    
}
class Anshuman extends Employee
{
    Anshuman()
    {
       // super(50);
        System.out.println("im inside anshuman classs");
        
    }
}
class Swastik extends Anshuman{
    Swastik()
    {
       // super();
    }
}
class demoEmploypee
{

    public static void main(String[] args) {
    Swastik ans = new Swastik();
    // ans.input();
    // ans.show();
    // ans.show(89);
    }
}
