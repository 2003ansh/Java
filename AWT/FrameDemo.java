package AWT;
import java.awt.*;
class FrameDemo {
    Button b1;
    TextField t1,t2;
    Label lb1,lb2,lb3;
    Frame f;
    void Test()
    {
       Frame f=new Frame("Addition of two numbers");
        lb1=new Label("Enter First Number");
        lb1.setBounds(5,50,150,30);
        f.add(lb1);
       
        t1=new TextField();
        t1.setBounds(200,50,150,30);
        f.add(t1);

        lb2=new Label("Enter second Number");
        lb2.setBounds(5,50,150,30);
        f.add(lb2);
       
        t2=new TextField();
        t2.setBounds(200,50,150,30);
        f.add(t2);

        lb3=new Label("Result");
        lb3.setBounds(90,140,150,30);
        f.add(lb3);
       
       b1 =new Button("+");
       b1.setBounds(90,200,100,30);
       f.add(b1);
       f.setSize(500,500);
       f.setVisible(true);
    }
    public static void main(String args[])
    {
        FrameDemo ob=new FrameDemo();
    }
   
}
