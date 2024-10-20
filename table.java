import java.lang.*;
import java.util.*;

class table {
    public static void main(String sr[])
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to print table:");
        n=sc.nextInt();

        for(i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+" = "+(n*i));
        }
        
        i=1;
        while(i<=10)
        {
            System.out.println(n+"x"+i+" = "+(n*i));
            i++;
        }

        i=1;
        do
        {
            System.out.println(n+"x"+i+" = "+(n*i));
            i++;
        }while(i<=10);

    }
    
}
