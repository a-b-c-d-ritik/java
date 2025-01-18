abstract class shape
{
    abstract int perimeter();
    abstract int area();
}

class circle extends shape
{
    int r;
    int perimeter()
    {
        return (int)(2*Math.PI*r);
    }

    int area()
    {
        return (int)(Math.PI*Math.pow(r,2));
    }
}

class rectangle extends shape
{
    int l,b;
    int perimeter()
    {
        return (2*(l+b));
    }

    int area()
    {
        return (l*b);
    }
}
class shaperun 
{
    public static void main(String arg[])
    {
        shape s1= new circle();
        circle c=new circle();
        c.r=10;
        System.out.println("AR of circle="+s1.area());
    }

    
}
