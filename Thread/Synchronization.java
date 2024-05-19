class TestSynch {
    synchronized void printResult()
    {
        int index;
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
    
}
class Thread1 extends Thread
{
    TestSynch ob3;
    Thread1(TestSynch ob)
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
    TestSynch ob4;
    Thread2(TestSynch ob)
    {
        ob4=ob;
    }
    public void run()
    {
        ob4.printResult();
    }

}
class Synchronization
{
    public static void main(String args[])
    {
        TestSynch ob = new TestSynch();
        Thread1 ob1=new Thread1(ob);
        Thread2 ob2 =new Thread2(ob);
        ob1.start();
        ob2.start();
    }
}
