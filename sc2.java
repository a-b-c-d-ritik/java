//find username and domain name from email
import java.lang.*;
class sc2 
{ public static void main(String arg[])
    {
    String s="programmer@gmail.com";
    int i=s.indexOf("@");
    System.out.println(i);
    String username=s.substring(0,i);
    System.out.println(username);
    String domain=s.substring(i+1,s.length());
    System.out.println(domain);
    }
}
