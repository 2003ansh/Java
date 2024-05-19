class DemoThread1 extends Thread {
    public void run()
    {
        int index;
        for (index=1;index<=10;index++)
        {
            System.out.println(index+"value of"+Thread.currentThread().threadId());
            try{
                Thread.sleep(400);
            }
            catch(Exception ob)
            {
                System.out.println(ob);
            }
        }
    }
}
class DemoThread
{
    public static void main(String args[])
    {
        DemoThread1 ob1=new DemoThread1 ();//creation of thread
        DemoThread1 ob2=new DemoThread1();
        System.out.println("Id of ob1"+ob1.threadId());
        System.out.println("Id of ob1"+ob2.threadId());
        System.out.println("name of ob1"+ob1.getName());
        System.out.println("name of ob1"+ob2.getName());
        ob1.setName("java");
        ob2.setName("langyage");

        ob1.start();//moves to runable state
        try{
            ob1.join();
        }
        catch(Exception ob9)
        {
            System.out.println(ob9);
        }
        
        ob2.start();
        System.out.println("after modfication name of ob1"+ob1.getName());
        System.out.println("after modification name of ob2"+ob2.getName());
        
    }

}
