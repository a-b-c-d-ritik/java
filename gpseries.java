import java.lang.*;
import java.util.*;

class gpseries {
    public static void main(String ar[])
    {
        int ft,r,i,n,t;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Term:");
        ft=sc.nextInt();
        System.out.println("");
        System.out.print("Enter Common ratio:");
        r=sc.nextInt();
        System.out.println("");
        System.out.print("Enter no of terms to print:");
        n=sc.nextInt();
        t=ft;
        System.out.println("Gp series:");
        for(i=1;i<=n;i++)
        {
            System.out.printf("\t%d",t);
            t*=r;
        }

    }
    
}
