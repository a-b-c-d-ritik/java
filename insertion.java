import java.lang.*;
import java.util.*;
class insertion {
    public static void main(String ar[])
    {
        int a[]= new int[10];
        int n=6,i,t,p;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<6;i++)
        {
            System.out.printf("a[%d]=",i);
            a[i]=sc.nextInt();
        }
        System.out.println("Enter position index where you want to insert data:");
        p=sc.nextInt();
        System.out.println("Enter data to insert:");
        t=sc.nextInt();

        for(i=n;i>p;i--)
        {
        a[i]=a[i-1];
        }
        a[p]=t;
        n++;
        for(i=0;i<n;i++)
        {
            System.out.printf("\t%d",a[i]);
        }
    }
    
}
