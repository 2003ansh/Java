import java.util.Scanner;

public class Capitalize {
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the String:");
        String a,m;
        a=sn.nextLine();
        int b=a.length();
        System.out.println(b);
        String r[];
    r=a.split(" ");
    
    for(int i=0;i<r.length;i++)
    {
        r[i]=r[i].substring(0,1).toUpperCase()+r[i].substring(1);
    }
        m=String.join(" ", r);

        System.out.println(m);
       /*  x[i]=r[i];*/
       // x[i]=r[i].substring(0,1);
        //v=r[i].length();

       // y[i]=r[i].substring(1,v);
        //x[i]=x[i].toUpperCase();
    }
    }
    
