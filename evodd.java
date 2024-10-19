import java.lang.*;
import java.util.*;

class evodd 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("n=");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
