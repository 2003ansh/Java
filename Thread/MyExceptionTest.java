 // implementing runnable interface
 class MyExceptionDemo implements Runnable {
    int item;
   public void run()
    {
        for(item=1;item<=100;item++)
        {
            System.out.println("Value ="+item);

        }
    }
}
    
    class MyExceptionTest
    {
        public static void main(String args[])
        {
            MyExceptionDemo ob1=new MyExceptionDemo();//created one thread
            MyExceptionDemo ob2=new MyExceptionDemo();//created one thread
            MyExceptionDemo ob3=new MyExceptionDemo();//created one thread  
            
            Thread ob = new Thread(ob1); 
            ob.start();//moves to runnable state
            
            Thread ob5= new Thread(ob2); 
            ob5.start();//moves to runnable state
           
            Thread ob6 = new Thread(ob3); 
            ob6.start();//moves to runnable state
        }

    }

