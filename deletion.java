import java.lang.*;
import java.util.*;
class deletion {
    public static void main(String ar[])
    {
        int a[]= new int[10];
        int i,t,p;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.printf("a[%d]=",i);
            a[i]=sc.nextInt();
        }
        
        System.out.println("Enter data to delete:");
        t=sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]==t)
            {
            p=i;
            break;
            }
        }

        
        for(i=p;i<a.length-2;i++)
        {
            a[i]=a[i+1];
        }

        for(i=0;i<a.length;i++)
        {
            System.out.printf("\t%d",a[i]);
        }
    }
    
}
