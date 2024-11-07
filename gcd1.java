import java.lang.*;
import java.util.*;
class gcd1 
{   
    int gcd(int m,int n)
    {
        while(m!=n)
        {   
            if(m>n)
            m=m-n;
            else
            n=n-m;
        }
        return m;
    }
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.print("n1=");
        n1=sc.nextInt();
        System.out.print("n2=");
        n2=sc.nextInt();

        gcd1 obj= new gcd1();
        System.out.println("GCD of "+n1+" and "+n2+" is :"+obj.gcd(n1, n2));
    }
    
}
