 class rectangle {
    public int length;
    public int breadth;

    public int area()
    {
        return length*breadth;
    }

    public int perimeter()
    {
        return 2*(length+breadth);
    }

    public boolean issq()
    {
        if(length==breadth)
        return true;
        else
        return false;

        //or return length==breadth;
    }
 }
    
 class accessrect
    {
    public static void main(String ar[])
    {
        rectangle r=new rectangle();
        r.length=10;
        r.breadth=10;
        System.out.println("Area="+r.area());
        System.out.println("Perimeter="+r.perimeter());

        if(r.issq())
        System.out.println("square");
        else
        System.out.println("rectangle");

    }
    }

