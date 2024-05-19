
import java.util.Scanner;

class Time1 {
    int hr,min,sec;
    Time1(int a,int b, int c)
    {
        hr=a;
        min=b;
        sec=c;
    } 
    void display()
    {
        System.out.println(hr+":"+min+":"+sec);
    }
    void add(Time1 s,Time1 d)
    {
         this.hr=s.hr+d.hr;
         this.min=s.min+d.min;
         this.sec=s.sec+d.sec;
         
         if(this.sec>60)
         {
            this.min=this.min+(this.sec/60);
            this.sec=this.sec%60;
         }
         if(this.min>60)
         {
            this.hr=this.hr+(this.min/60);
            this.min=this.min%60;
         }
    }
    
}
class Time
{
    public static void main(String args[])
    {
    Scanner sn=new Scanner(System.in);
    int a,b,c,d,e,f;
    System.out.println("Enter time 1");
    a=sn.nextInt();
    b=sn.nextInt();
    c=sn.nextInt();
    System.out.println("Enter time 2");
    d=sn.nextInt();
    e=sn.nextInt();
    f=sn.nextInt();
    Time1 ob=new Time1(a, b, c);
    Time1 ob1=new Time1(d, e, f);
    Time1 ob3=new Time1(0, 0, 0);
    ob3.add(ob,ob1);
    ob3.display();

    }


}
