import java.lang.*;
import java.util.*;

class armstrong {
    public static void main(String ar[])
    {
        int i,n,r,t,arm=0,ctr=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to check:");
        n=sc.nextInt();
        t=n;
        while(n>0)
        {
            i=n%10;
            if(i!=0)
            ctr++;
            n=n/10;
        }   
        n=t;
        for(i=10;n>0;)
        {
            r=n%10;
            arm+=(int)Math.pow(r,ctr);
            n/=10;
        }

        if(arm==t)
        System.out.println("Armstrong");
        else
        System.out.println("Not Armstrong");


    }
    
}
