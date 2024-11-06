import java.lang.*;
import java.util.*;
class multiplicationmatrix {
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int A[][]=new int[3][3];
        int B[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j,k;
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

    for(i=0;i<A.length;i++)
    {
    for(j=0;j<B.length;j++)
    {
    c[i][j]=0;
    for(k=0;k<c.length;k++)
    {
    c[i][j]=c[i][j]+A[i][k]*B[k][j];
    }
    }
    }
        System.out.printf("\n\n\n Multiplication of arrays are:\n");
        for(i=0;i<c.length;i++)
        {
            for(j=0;j<c[i].length;j++)
            {
                System.out.printf("%d\t",c[i][j]);
            }
            System.out.println("");
        }

    }
    
}
