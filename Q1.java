import java.util.Scanner;
import java.util.*;

class ComplexNum {
    int real,img;
    /*ComplexNum()
    {
        real=0;
        img=0;
    }*/
    ComplexNum(int a,int b)
    {
        real=a;
        img=b;
    }
    void display()
    {
        System.out.println(real+" + " +img+"i");

    }
    void addComNumber(ComplexNum s, ComplexNum n)
    {
        this.real=s.real+n.real;
        this.img=s.img+n.img;
      
    }
    
    }
    class Q1
    {
        public static void main(String args[])
        {
            Scanner sn=new Scanner(System.in);
            int a,b,c,d;
            System.out.println("Enter the 1st complex number:");
            a=sn.nextInt();
            b=sn.nextInt();
            System.out.println("Enter the 2nd complex number:");
            c=sn.nextInt();
            d=sn.nextInt();
            ComplexNum ob1=new ComplexNum(a, b);
            ComplexNum ob2=new ComplexNum(c, d);
            ComplexNum ob3=new ComplexNum(0,0);
            ob3.addComNumber(ob1, ob2);
            ob3.display();
        }
       

    }
