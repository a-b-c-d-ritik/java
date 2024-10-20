import java.lang.*;
import java.util.*;
class sumn {
    public static void main(String ar[])
    {
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to find sum:");
        n=sc.nextInt();

        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of "+n+" numbers is: "+sum);

        i=1;sum=0;
        while(i<=n)
        {
            sum=sum+i;
        }
        System.out.println("sum of "+n+" numbers is: "+sum);

        i=1;sum=0;
        do{
            sum=sum+i;
        }while(i<=n);
        System.out.println("sum of "+n+" numbers is: "+sum);


    }
    
}
