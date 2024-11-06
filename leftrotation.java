import java.lang.*;
import java.util.*;
class leftrotation {
public static void main(String ar[])
{
    int a[]= new int[10];
    int i,temp;
    Scanner sc= new Scanner(System.in);
    for(i=0;i<10;i++)
    {
        System.out.printf("a[%d]=",i);
        a[i]=sc.nextInt();
    }
    
    temp=a[0];
    for(i=0;i<a.length-1;i++)
    {
        a[i]=a[i+1];   
    }
    a[a.length-1]=temp;

for(i=0;i<a.length;i++)
{
    System.out.printf("\t%d",a[i]);
}
}
}
