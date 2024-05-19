import java.util.Scanner;

public class Palindromestring {
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the String:");
        String a=sn.next();
        int b=a.length();
        System.out.println(b);
        int z=b/2;
        for(int i=0;i<=b/2;i++)
     {
           if(a.charAt(i)!=a.charAt(b-i-1))
        {
            System.out.println("noo it is not palindrome");
            break;
        }
        else
        {
            System.out.println("yess it is palindrome");
        }
    }
    String r[];
    r=a.split("");
    String x[],y[];
    for(int i=0;i<r.length;i++)
    {
        x[i]=r[i].substring(0,1);
        y[i]=r[i].substring(1,r[i].length());
        x[i]=x[i].toUpperCase();
    }
    
}
