import java.lang.*;
import java.util.*;
class addmatrix {
    public static void main(String ar[])
    {   Scanner sc= new Scanner(System.in);
        int A[][]=new int[3][3];
        int B[][]=new int[3][3];
        int sum[][]=new int[3][3];
        int i,j;
        System.out.println("Enter data in first matrix:");
        for(i=0;i<A.length;i++) 
        {
            for(j=0;j<A[i].length;j++)
            {
            System.out.printf("A[%d][%d]=",i,j);
            A[i][j]=sc.nextInt();
            System.out.println("");
            }
        }

        System.out.println("Enter data in Second matrix:");
        for(i=0;i<B.length;i++)
        {
            for(j=0;j<B[i].length;j++)
            {
            System.out.printf("B[%d][%d]=",i,j);
            B[i][j]=sc.nextInt();
            System.out.println("");
            }
        }

        
        for(i=0;i<sum.length;i++)
        {
            for(j=0;j<sum[i].length;j++)
            {
            sum[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.printf("\n\n\n sum of arrays are:\n");
        for(i=0;i<sum.length;i++)
        {
            for(j=0;j<sum[i].length;j++)
            {
                System.out.printf("%d\t",sum[i][j]);
            }
            System.out.println("");
        }

    }
    
}
