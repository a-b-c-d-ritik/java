import java.lang.*;

class bitwise 
{
    public static void main(String arg[])
    {
        int x=10,y=6,z;
        z=x&y;//AND
        System.out.println(z);
        z=x|y;//OR
        System.out.println(z);
        z=x^y;//XOR
        System.out.println(z);
        z=x<<1;//LEFT SHIFT OPERATOR
        System.out.println(z);
        x=-10;
        z=x>>1;//RIGHT SHIFT OPERATOR
        System.out.println(z);
        z=x>>>1;//UNSIGNED RIGHT SHIFT OPERATOR
        System.out.println(z);
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
        z=~x;
        System.out.println(z);
    }
    
}
