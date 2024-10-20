import java.lang.*;
import java.util.*;

class palindromeno{
    public static void main(String ar[])
    {
        int n,r,rev=0,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no:");
        n=sc.nextInt();
        t=n;

        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }

        //System.out.println("Reverse of "+t+" is : "+rev);
        if(t==rev)
        System.out.println("palindrome");
        else
        System.out.println("Not palindrome");

    
    
    
    }
    
}
