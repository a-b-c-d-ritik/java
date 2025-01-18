
interface test
{
    void m1();
    void m2();
}
class temp implements test
{
    public void m1()
    {
        System.out.println("m1");
    }
    public void m2()
    {
        System.out.println("m2");
    }
    void m3()
    {
        System.out.println("m3");
    }
}
class interfacepractice 
{
    public static void main(String ar[])
    {
        test t=new temp();
        t.m1();
        t.m2();
        //t.m3();
    }
}
