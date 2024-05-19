public class builder {
    static void update1(String str1)
    {
        str1=str1+"morning";
        System.out.println("hash code of str1 in static "+str1.hashCode());
    }
    static void update2(StringBuffer str2)
    {
        str2.append("morning");
        System.out.println("hash code of str2 in static "+str2.hashCode());
    }
    static void update3(StringBuilder str3)
    {
        str3.append("morning");
        System.out.println("hash code of str3 in static "+str3.hashCode());
    }
    
    public static void main(String args[])
    {
        String str1="Good";
        System.out.println("before change "+str1);
        System.out.println("hash code of str1 "+str1.hashCode());
        update1(str1);
        System.out.println("after change "+str1);
        
        StringBuffer str2= new StringBuffer("good");
        System.out.println("before change  "+str2);
        System.out.println("hash code of str2 "+str2.hashCode());
        update2(str2);
        System.out.println("after change "+str2);

        StringBuilder str3= new StringBuilder("good");
        System.out.println("before change  "+str3);
        System.out.println("hash code of str3 "+str3.hashCode());
        update3(str3);
        System.out.println("after change "+str3);

    }

    
}
