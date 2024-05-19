public class StringMethods {
    public static void main(String args[])
    {
        String a="Anshuman nayak nayak raa";
        String b=new String("nayak");
        char arr[]={'a','b','c'};
        
        System.out.println("String a "+a);
        System.out.println("String b "+b);
        int len1=a.length();
        System.out.println("the length of first string is"+len1);
        System.out.println("the concate string is"+a.concat(b));
        String substr=a.substring(5,5);
        System.out.println(substr);
        boolean value=a.startsWith("A");
        if(value)
        {
            System.out.println("yes it is starting");
        }
        else
        {
            System.out.println("no it is starting");
        }
        System.out.println("upper case "+b.toUpperCase());
        System.out.println("lower case "+a.toLowerCase());
        String res[];
        res=a.split(" ");
        for(int index=0;index<res.length;index++)
        {
            System.out.println(res[index]) ;
        }
        String d= "asdf";
        String e="asdf";
        if(d==e)
        {
            System.out.println("yess");

        }
            
        else
        {
            System.out.println("no");

        }
    
}
}
