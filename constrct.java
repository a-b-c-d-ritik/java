class constrct 
{
    private int length;
    private int breadth;

    public constrct()
    {
        length=1;
        breadth=1;
    }

    public constrct(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public int area()
    {
        return length*breadth;
    }

    public int perimeter()
    {
        return 2*(length+breadth);
    }

    
}

class main
{
    public static void main(String ar[])
    {
        constrct c1=new constrct();
        System.out.println(c1.area());

        constrct c2= new constrct(10,25);
        System.out.println(c2.area());

    }
}
