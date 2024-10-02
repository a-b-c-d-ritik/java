import java.lang.*;
import java.util.*;
public class xorswap 
{
    public static void main(String arg[])
    {
        int n1,n2;
        Scanner sc= new Scanner(System.in);
        System.out.println("n1=");
        n1=sc.nextInt();
        System.out.println("n2=");
        n2=sc.nextInt();

        System.out.println("Before swapping: n1="+n1+"  n2= "+n2);
        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;
        System.out.println("After swapping: n1="+n1+"  n2= "+n2);

    }
    
}
