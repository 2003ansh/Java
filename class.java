// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Employpee
{
    String ename;
    int id,bs;
    float da,hra,gs;
    Employpee(String a,int b,int c)
    {
        ename=a;
        bs=b;
        id=c;
    }
 void calgrossSal(int a,int b)
 {
    da=bs+(bs*20)/100;
    hra=bs+(bs*10)/100;
    gs=bs+da+hra;

 } 
 void display()
 {
    System.out.println("name of employee="+ename+"id="+id+"basic sal="+bs);
    System.out.println("gross salary is="+gs);

 }  
}
class demoEmploypee
{
    public static void main(String args[])
    {
        int x,y,i=0;
        String z;
        Scanner imp=new Scanner(System.in);
        Employpee e[]=new Employpee[3];
         while(i<3)
         {
        System.out.println("enter name,basic salary,id");
        z=imp.next();
        x=imp.nextInt();
        y=imp.nextInt();
       e[i]=new Employpee(z,x,y);
        e[i].calgrossSal();
        e[i].display();
        i++;
        }
         /*System.out.println("enter name,basic salary,id ");
        z=imp.next();
        x=imp.nextInt();
        y=imp.nextInt();
        Employpee e=new Employpee(z,x,y);
        e.calgrossSal();
        e.display();*/

    }
}