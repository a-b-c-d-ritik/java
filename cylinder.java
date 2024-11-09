class cylinder 
{
    public double radii;
    public double height;

    public double vol()
    {
        return Math.PI*radii*radii*height;
    }
    
    public double TSA()
    {
        return 2*Math.PI*radii*(radii+height);
    }

    public double CSA()
    {
        return 2*Math.PI*radii*height;
    }
}

class accesscyl
{
    public static void main(String ar[])
    {
    cylinder c= new cylinder();
    c.radii=10.4;
    c.height=10.4;

    System.out.println("Vol="+c.vol());
    System.out.println("TSA:"+c.TSA());
    System.out.println("CSA:"+c.CSA());
    }
}
