import java.lang.*;
import java.util.*;

class arraycopy {
    public static void main(String arg[])
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]= new int[10];
        int i,j;
        for(i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        for(i=0;i<b.length;i++)
        {
            System.out.printf("%d\t",b[i]);
        }
        System.out.printf("\n\n\n");
        //reverse copy
        int rev[]= new int[10];
        for(i=a.length-1,j=0;i>=0 & j!=a.length;i--,j++)
        {
            rev[j]=a[i];
        }
        for(i=0;i<b.length;i++)
        {
            System.out.printf("%d\t",rev[i]);
        }
    }
    
}
