 /*use of abstaction in java */
 class ABC{
    ABC()
    {
        System.out.println("My smart home");
    }
    Void beautiful()
    {
        System.out.println("My home is beautiful");
    }
    /*void movement();
     * void talk();
     * void disappear();
     */
 }
 class DemoAbstract
 {
    public static void main(String args[])
    {
        ABC ob = new ABC();
        ob.beautiful();
    }
 } 