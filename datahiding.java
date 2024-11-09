class datahiding
{
    private int length;
    private int breadth;

    public int getLength()
    {
        return length;
    }

    public void setLength(int l)
    {
        length=l;
    }

    public int getBreadth()
    {
        return breadth;
    }

    public void setbreadth(int b)
    {
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

class test
{
    public static void main(String ar[])
    {
    datahiding obj=new datahiding();
    //obj.length=10;
    obj.setLength(10);
    obj.setbreadth(10);
    System.out.println("Area="+obj.area());
    }
}
