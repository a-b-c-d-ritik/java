import java.lang.*;
import java.util.*;

class  fibonacci
{
    public static void main(String ar[])
    {
        int a,b,c,n,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of terms:");
        n=sc.nextInt();
        System.out.printf("\nFibonacci series:");
        a=0;b=1;

        for(i=1;i<=n;i++)
        {   
            System.out.printf("\t%d",a);
            c=a+b;
            a=b;
            b=c;
            
        }
    }
}
