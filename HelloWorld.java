package p1;
import p1.George;

class HelloWorld
{
    public void m1()
    {
        System.out.println("Hellow World!");
    }

    public static void main(String args[])
    {
        HelloWorld obj = new HelloWorld();
        obj.m1();
        George g = new George("George");
        System.out.println(g.getName());
    }

}