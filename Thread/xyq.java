class BankAccount {
    int balance =5000;
    synchronized void withdraw(int amount)
    {
        System.out.println("Before withdraw the balance is"+balance);
        System.out.println("I want to withdaw");
        if(balance<amount)
        {
            System.out.println("REquired amount is more than balance");
            try
            {
                wait();
            }
            catch(Exception ob)
            {
                System.out.println(ob);
            }
        }
        System.out.println("Ready to withdraw");
        balance=balance-amount;
        System.out.println("Balance after withdraw is"+balance);

    }
    synchronized void deposit(int amount)
    {
        System.out.println("Before deposit the balance is "+balance);
        balance=balance+amount;
        System.out.println("DEposit over");
        notify();
    }
    class students extends Thread
    {
        BankAccount ob3;
        students(BankAccount ob)
        {
            ob3=ob;
        }
        public void run()
        {
            ob3.withdraw(25000);
        }

    }
    class parents extends Thread
    {
        BankAccount ob4;
        parents(BankAccount ob)
        {
            ob4=ob;
        }
        public void run()
        {
            ob4.deposit(100000);
        }

    }
    class InterThread
    {
        public static void main(String args[])
        {
            BankAccount ob1=new BankAccount();
            students ob2=new students(ob1);
            parents ob3=new parents(ob1);
            ob2.start();
            ob3.start(); 
        }
    }


    
}

