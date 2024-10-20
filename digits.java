import java.lang.*;
import java.util.*;
class digits {
    public static void main(String ar[])
    {
        int n,i,d,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        n=sc.nextInt();
        t=n;
        for(i=10;n>0;)
        {
            d=n%i;
            System.out.println(d+" is at "+i+" position ");
            n=n/10;
        }
        i=10;
        n=t;
        while(n>0)
        {
            d=n%i;
            System.out.println(d+" is at "+i+" position ");
            n=n/10;
        }

    }
    
}
