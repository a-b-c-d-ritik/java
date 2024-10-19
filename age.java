import java.lang.*;
import java.util.*;

class age 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("age=");
        age=sc.nextInt();
        if(age<=18)
        {
            System.out.println("young");
        }
        else if(age>=18 && age<=60)
        {
            System.out.println("adult");
        }
        else
        {
            System.out.println("old");
        }

    }
    
}
