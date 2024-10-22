import java.lang.*;
import java.util.*;
class array {
    public static void main(String ar[])
    {   
        int i;
        int A[]=new int[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter elements:");
        for(i=0;i<5;i++)
        {
            System.out.printf("\nA[%d]=",i);
            A[i]=sc.nextInt();
        }

        for(int x : A)
        {
            System.out.println(x);
        }

        int []B={22,33,44,55,66,77,88,99};
        for(int x :B)
        {
            System.out.println(x);
        }
    }
    
}
