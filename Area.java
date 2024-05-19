import java.util.Scanner;

abstract class Shape {
    float dimone,dimtwo;
    Shape(Float a,Float b)
    {
        dimone=a;
        dimtwo=b;
    }
    abstract float computearea();
}
class Reactangle extends Shape
{
    Reactangle(float a,float b)
    {
        super(a,b);
    }
    float computearea()
    {
        float r=dimone*dimtwo;
        System.out.println("Area of rectangle: "+r );
        return r;
    }

}
class Triangle extends Shape
{
    Triangle(Float a,Float b)
    {
        super(a,b);
    }
    float computearea()
    {
        int t=(dimone*dimtwo);
        System.out.println("Area of rectangle: "+t );
        return t;
    }

}
class Area
{
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        float a,b,c,d;
        System.out.println("Enter the Dim of rectanglr");
        a=sn.nextFloat();
        b=sn.nextFloat();
        Reactangle ob=new Reactangle(a,b);
        ob.computearea();

        System.out.println("Enter the Dim of triangle");
        c=sn.nextFloat();
        d=sn.nextFloat();
        Triangle ob1=new Triangle(a,b);
        ob1.computearea();
        //System.out.println("Area of rectangle: "+Reactangle.computearea() );

    }
}
