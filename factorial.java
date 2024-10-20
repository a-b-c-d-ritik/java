import java.lang.*;
import java.util.*;
class factorial {
    public static void main(String ar[])
    {
        int n,i,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            fact*=i;
        }
            System.out.println("Factorial of "+n+" is = "+fact);
    }
    
}
