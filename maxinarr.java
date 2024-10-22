import java.util.Scanner;

class maxinarr {
    public static void main(String ar[])
    {
        int A[]=new int[5];
        int i,max=0;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.printf("A[%d]=",i);
            A[i]=sc.nextInt();
            if(A[i]>max)
            max=A[i];
        }
        System.out.println("Max in array is "+max);
    }
    
}
