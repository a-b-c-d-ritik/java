import java.lang.*;
import java.util.*;

class leapyr 
{
    public static void main(String ag[])
    {
    int year;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter year to check:");
    year=sc.nextInt();

    if(year%4==0 && year%100!=0)
    {
        System.out.println("Leap year");

    }
    else if(year%400==0)
    {
    System.out.println("leap year");
    }
    else
    System.out.println("Not a leap year");
    
    }
}
