import java.lang.*;
import java.util.*;
class incsizearray {
    public static void main(String ar[])
    {
        int a[]={10,20,30,4,50,60,70,80,90};
        int b[]= new int[2*a.length];
        int i;
        for(i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        a=b;//a is garbage collected
        b=null;
        for(i=0;i<a.length;i++)
        System.out.printf("%d\t",a[i]);
        
    
    }
    
}
