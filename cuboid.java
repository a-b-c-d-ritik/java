import java.lang.*;
import java.util.*;
class cuboid 
{
    public static void main(String arg[])
    {
        float l,b,h,vol,tsa;
        Scanner x=new Scanner(System.in);

        System.out.println("Enter dimensions of cuboid");
        System.out.print("l=");
        l=x.nextFloat();
        System.out.print("b=");
        b=x.nextFloat();
        System.out.print("h=");
        h=x.nextFloat();

        vol=l*b*h;
        tsa=(l*b)+(b*h)+(l*h);
        System.out.println("Vol of cuboid is: "+vol);
        System.out.println("Total Surface Area of cuboid is: "+tsa);


    }
}
