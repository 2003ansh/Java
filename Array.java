import java.util.Scanner;
class Array
{
    public static void main(String args[]) 
    {
        int i,size;
        Scanner imp=new Scanner(System.in);
        int a[]=new int[30];
        System.out.println("Enter the size of array");
        size=imp.nextInt();
        for(i=0;i<size;i++)
        {
            a[i]=imp.nextInt();
        }

         for(i=0;i<size;i++)
        {
            System.out.println(+a[i]);
        }
        
    }
}