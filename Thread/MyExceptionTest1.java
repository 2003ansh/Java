class MyExceptionTest2 extends Thread {
    int item,a,b;
    MyExceptionTest2(int m,int n)
    {
        a=m;
         b=n;
    }
    public void run()
    {
        for(item=a;item<=b;item++)
        {
            if(item%2==0)
            {
            System.out.println("child thread ="+item);
            }
        }
    }
    
}
class MyExceptionTest1
{
    public static void main(String args[])
    {
        MyExceptionTest2 ob1=new MyExceptionTest2(1,10);//creation of thread
        ob1.start();//moves to runable state
        try{
            ob1.join();
        }
        catch(Exception ob9)
        {
            System.out.println(ob9); 
        }
       // MyExceptionTest2 ob2=new MyExceptionTest2(10,21);
       // ob2.start();
       for(int item=10;item<=21;item++)
        {
            if(item%2!=0)
            {
            System.out.println("main thread ="+item);
            }
        }
    }

}
