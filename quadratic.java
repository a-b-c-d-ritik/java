import java.lang.*;
import java.util.*;

class quadratic 
{
    public static void main(String arg[])
    {
        int a,b,c;
        double r1,r2,d;
        Scanner x=new Scanner(System.in);

        System.out.println("Enter the coefficients of quadratic equation ax^2+bx+c=0");
        System.out.print("a=");
        a=x.nextInt();
        System.out.print("b=");
        b=x.nextInt();
        System.out.print("c=");
        c=x.nextInt();

        d=(b*b)-4*a*c;
        r1=(-b+Math.sqrt(d))/(2*a);
        r2=(-b-Math.sqrt(d))/(2*a);

        System.out.println("r1="+r1);
        System.out.println("r2="+r2);

    }
    
}
