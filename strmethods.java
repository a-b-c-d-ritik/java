import java.lang.*;
import java.util.*;

class strmethods 
{
    public static void main(String arg[])
    {
        String s1= new String("Java");
        System.out.println(s1.length());

        String s2=s1.toUpperCase();
        System.out.println(s2);
        System.out.println(s2.toLowerCase());

        String s3="  tmkuc  ";
        System.out.println(s3.trim());

        String s4="bihar";
        System.out.println(s4.substring(3)); //print from position 3rd to last
        System.out.println(s4.substring(0,3));

        System.out.println(s4.replace('i', 'k'));
        System.out.println(s4.startsWith("b"));
        System.out.println(s4.startsWith("v"));

        System.out.println(s4.endsWith("r"));
        System.out.println(s4.endsWith("v"));

        System.out.println(s4.charAt(3));
        
        System.out.println(s4.indexOf(s4));
        System.out.println(s4.lastIndexOf("b"));
        System.out.println(s4.lastIndexOf("x"));

        System.out.println(s4.lastIndexOf(4));
        System.out.println(s4.lastIndexOf("h"));

        String x="urban";
        System.out.println(x.indexOf("utopi"));

        String s_1="JAVA";
        String s_2="java";
        String s_3="python";
        String s_4="python";

        System.out.println(s_1.equals(s_1));
        System.out.println(s_1.equals(s_2));
        System.out.println(s_3.equals(s_4));
        System.out.println(s_1.equalsIgnoreCase(s_2));

        System.out.println(s_1.compareTo(s_2));
        System.out.println(s_1.compareToIgnoreCase(s_2));
        System.out.println(s_1.compareTo(s_3));

        String a="xyz";
        String b="xyz";
        System.out.println(a.equals(b));
        System.out.println(a==b);
        String t= new String("xyz");
        System.out.println(t==b);

        String sus="india is the best country";
        String sx="in the world";
        System.out.println(sus.contains("best"));
        System.out.println(sus.concat(sx));

        System.out.println(String.valueOf(65));





        


    }
    
}
