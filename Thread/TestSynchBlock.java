 class TestSynchBlock1 {
     void printResult()
    {
        int index;
        System.out.println("Welcome"+Thread.currentThread());
        System.out.println("Good"+Thread.currentThread());
        synchronized(this)
        {
            for(index=0;index<=10;index++)
        {
            System.out.println(index+"value of thread"+Thread.currentThread());
            try{
                Thread.sleep(300);
            }
            catch(Exception ob9)
            {
                System.out.println(ob9);
            }
        }

        }
        System.out.println("Apple"+Thread.currentThread());
        
    }
    
}
class Thread1 extends Thread
{
    TestSynchBlock1 ob3;
    Thread1(TestSynchBlock1 ob)
    {
        ob3=ob;
    }
    public void run()
    {
        ob3.printResult();
    }

}
class Thread2 extends Thread
{
    TestSynchBlock1 ob4;
    Thread2(TestSynchBlock1 ob)
    {
        ob4=ob;
    }
    public void run()
    {
        ob4.printResult();
    }

}
class TestSynchBlock
{
    public static void main(String args[])
    {
        TestSynchBlock1 ob = new TestSynchBlock1();
        Thread1 ob1=new Thread1(ob);
        Thread2 ob2 =new Thread2(ob);
        ob1.start();
        ob2.start();
    }
    
}
