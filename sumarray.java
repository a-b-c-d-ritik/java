import java.lang.*;
import java.util.*;

class sumarray {
    public static void main(String ar[])
    {
        int A[]=new int[5];
        int i,sum=0;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.printf("A[%d]=",i);
            A[i]=sc.nextInt();
            sum=sum+A[i];
        }

        for(i=0;i<A.length;i++)
        {
        System.out.printf("A[%d]=%d\n",i,A[i]);
        }
        System.out.println("sum of array is :"+sum);

    }
    
}
