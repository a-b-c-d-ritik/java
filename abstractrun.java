class parent
{
    parent()
    {
        System.out.println("parent constructor");
    }

    void mthd1()
    {
        System.out.println("parent's methd1");
    }
}

abstract class relative
{
    relative()
    {
        System.out.println("relative constructor");
    }

    void mthd2()
    {
        System.out.println("relative's methd1");
    }

    abstract void methd3();
}

class child extends relative
{
    child()
    {
        System.out.println("child's constructor");
    }

    @Override
    void methd3()
    {
        System.out.println("methd3 unlocked");
    }

}

class abstractrun
{
    public static void main(String ar[])
    {
        parent p= new parent();
        p.mthd1();

       // relative r=new relative();
        child c= new child();
        c.methd3();

        relative r=new child();
        r.mthd2();
    }
    
}
 