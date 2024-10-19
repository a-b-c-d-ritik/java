//find if the email id is on gamail
import java.lang.*;
class sc1 
{
    public static void main(String ar[])
    {
        String s="programmer@gmail.com";
        if(s.matches("\\w*@gmail.*"))
        System.out.println("yes email id is on gmail");
    }
    
}
