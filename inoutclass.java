class outer
{
    static int x=10;
    inner i=new inner();
    outer()
    {
        System.out.println("outer const");
    }
    class inner
    {
        int y=5;
        inner()
        {
            System.out.println("inner const");
        }
        void innerdisplay()
        {
            System.out.println(x+y);
        }
    }

    void outerdisplay()
    {
        //inner i=new inner();
        i.innerdisplay();
    }
}
class inoutclass {
    public static void main(String[] args) {
        outer o = new outer();
        o.outerdisplay();

        outer.inner oi=new outer().new inner();
        oi.innerdisplay();
    }
}
