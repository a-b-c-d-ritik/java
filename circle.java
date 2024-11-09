class circle
{
    public double radii;

    public double area()
    {
        return Math.PI*radii*radii;
    }

    public double perimeter()
    {
        return 2*Math.PI*radii;
    }
    
}

class accesscircle
{
    public static void main(String ar[])
    {
        circle c=new circle();
        c.radii=10;
        System.out.println("Area="+c.area());
        System.out.println("Perimeter="+c.perimeter());
    }
}
