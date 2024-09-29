import java.lang.*;
import java.util.*;

class trianglearea 
{
    public static void main(String arg[])
    {
        double b,h,area,a,s;
        Scanner x=new Scanner(System.in);
        System.out.print("base=");
        b=x.nextDouble();
        System.out.print("height=");
        h=x.nextDouble();
        area=(b*h)/2;
        System.out.println("area of triangle is " +area);

        System.out.print("a=");
        a=x.nextDouble();
        System.out.print("b=");
        b=x.nextDouble();
        System.out.print("c=");
        h=x.nextDouble();

        s=(a+b+h)/2;
        area=Math.sqrt(((s*(s-a))*(s-b))*(s-h));

        System.out.println("area of triangle is " +area);
        
    }
}
