class circle
{
    public double radii;

    public circle()
    {
        radii=0.00;
    }

    public double area()
    {
        return Math.PI*radii*radii;
    }

    public double perimeter()
    {
        return 2*Math.PI*radii;
    }
}

class cylinder extends circle
{
    public double height;

    public cylinder()
    {
        height=0.00;
    }

    public double vol()
    {
        return area()*height;
    }

}

class inheriteg 
{
    public static void main(String ar[])
    {
        cylinder c= new cylinder();
        c.radii=10;
        c.height=10;
        System.out.println("vol="+c.vol());
        System.out.println("Area="+c.area());

    }
    
}
