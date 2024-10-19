import java.lang.*;
import java.util.*;
class findradix {
    public static void main(String arg[])
    {
        String nm;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data to find radix");
        nm=sc.next();
        if(nm.matches("[01]+"))
        {
            System.out.println("radix is 2");
        }
        else if (nm.matches("[0-7]+")) 
        {
            System.out.println("radix is 8");
        }
        else if(nm.matches("[0-9A-F]+"))
        {
            System.out.println("radix is 16");
        }
        else
        {
            System.out.println("invalid data");
        }
    }
    
}
