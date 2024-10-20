import java.lang.*;
import java.util.*;
class noofdigits {
    public static void main(String ar[])
    {
    int i,n,ctr=0,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no:");
    n=sc.nextInt();
    temp=n;
    while(n>0)
    {
    i=n%10;
    if(i!=0)
        ctr++;
    n=n/10;
    }
    System.out.println("No of digits in "+temp+" is :"+ctr);
    }
}
