import java.lang.*;
import java.util.*;
/*NOTE: COMPLEXITY LOGIC :- NO K HALF TK M FACTORS DHUNDHO AGAR KOI MILA TO THEEK
NHI MILA TO PRIME, FALTU JYADA NO se DIV CHECK NHI KRNA H KYUKI FACTOR INT CHHIYE */
public class primemethod 
{
    boolean prime(int x)
    {
        int i,ctr=0;
        for(i=2;i<=(x/2);i++)
        {
            if(x%i==0)
            ctr++;
        }
        if(ctr==0)
        return true;
        else
        return false;

    }
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter no to check prime:");
        n=sc.nextInt();
        primemethod obj=new primemethod();
        if(obj.prime(n))
        System.out.println("prime");
        else
        System.out.println("Not prime");

    }
}
