
class areacalc
{
    static int area(int r)
    {
        return (int)Math.PI*r*r;
    }
    static float area(float r)
    {
        return (float)Math.PI*r*r;
    }
    static int area(int l,int b)
    {
        return l*b;
    }
    static float area(float l,float b)
    {
        return l*b;
    }
    
    public static void main(String ar[])
    {
        System.out.println("Area of circle: "+area(2));
        System.out.println("Area of circle: "+area(3.4f));
        System.out.println("Area of circle: "+area(4,6));
        System.out.println("Area of circle: "+area(3.3f,4.6f));

    }

    
}
