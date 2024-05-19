 /*use of abstaction in java */
 abstract class ABC{
    ABC()
    {
        System.out.println("My smart home project");
    }
    void b()
    {
        System.out.println("My home is beautiful");
    }
    abstract void movement();
    abstract void talk();
    abstract void disappear();
 }
 class XYZ extends ABC{
    void movement()
    {
        System.out.println("My home can move");
    }
    void talk()
    {
        System.out.println("My home can talk");
    }
    void disappea65r()
    {
        System.out.println("My home can disappear");
    }
 }
 class DemoAbstract
 {
    public static void main(String args[])
    {
        XYZ ob = new XYZ();
        ob.b();
        ob.movement();
        ob.talk();
        ob.disappear();
    }
 } 