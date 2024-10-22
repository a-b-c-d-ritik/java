import java.util.Scanner;

class secondmax {
    public static void main(String ar[])
    {
        int A[]=new int[5];
        int i,max1=0,max2=0;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.printf("A[%d]=",i);
            A[i]=sc.nextInt();
        }

        for(i=0;i<5;i++)
        {
            if(A[i]>max1)
            {
            max2=max1;
            max1=A[i];
            }
            else if(A[i]>max2)
            max2=A[i];
        }
        System.out.println("Second max is "+max2);
    }
    
}
