import java.lang.*;
import java.util.*;

class apseries {
    public static void main(String ar[])
    {
        int ft,cd,i,n,t=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Term:");
        ft=sc.nextInt();
        System.out.println("");
        System.out.print("Enter Common Difference:");
        cd=sc.nextInt();
        System.out.println("");
        System.out.print("Enter no of terms to print:");
        n=sc.nextInt();
        t=ft;
        System.out.println("Ap series:");

        for(i=1;i<=n;i++)
        {
            System.out.printf("\t%d",t);
            t+=cd;
        }

    }
    
}
