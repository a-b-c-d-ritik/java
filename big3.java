import java.lang.*;
import java.util.*;
class big3 
{
    public static void main(String ar[])
    {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.print("n1=");
        n1=sc.nextInt();
        System.out.print("n2=");
        n2=sc.nextInt();
        System.out.print("n3=");
        n3=sc.nextInt();

        if(n1>n2 && n1>n3)
        {
        System.out.println(n1+" is greatest");
        }
        else if(n2>n3)
        {
        System.out.println(n2+" is greatest");
        }
        else
        {
        System.out.println(n3+" is greatest");
        }
        
    }
    
}
