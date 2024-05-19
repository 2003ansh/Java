 class TestSynchStatic1 {
    synchronized static void printResult()
    {
        int index;
        System.out.println("Welcome"+Thread.currentThread());
        System.out.println("Good"+Thread.currentThread());

            for(index=0;index<=10;index++)
        {
            System.out.println(index+"Thread id  "+Thread.currentThread());
            try{
                Thread.sleep(300);
            }
            catch(Exception ob9)
            {
                System.out.println(ob9);
            }
        }

        
        System.out.println("Apple"+Thread.currentThread());
        
    }
    
}
class Thread1 extends Thread
{
   
    public void run()
    {
        TestSynchStatic1.printResult();
    }

}
class Thread2 extends Thread
{
    
    public void run()
    {
        TestSynchStatic1.printResult();
    }

}
class Thread3 extends Thread
{
    
    public void run()
    {
        TestSynchStatic1.printResult();
    }

}
class TestSynchStatic
{
    public static void main(String args[])
    {
        Thread1 ob1=new Thread1();
        Thread2 ob2 =new Thread2();
        Thread3 ob3 =new Thread3();
        ob1.start();
        ob2.start();
        ob3.start();
    }
    
    
}
