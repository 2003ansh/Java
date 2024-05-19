import java.util.Scanner;

public class Buffer {
    public static void main(String args[])
    {
        StringBuffer name=new StringBuffer();
        String fname,mname,lname;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name:");
        fname=sc.nextLine();
        System.out.println("Enter the middle name:");
        mname=sc.nextLine();
        System.out.println("Enter the last name:");
        lname=sc.nextLine();

        name.append(fname);
        name.append(lname);
        System.out.println(name);
        int len=fname.length();
        name.insert(len,mname);
       // name.append()
       System.out.println(name);


    }
    
}
