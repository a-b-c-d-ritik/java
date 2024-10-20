import java.lang.*;
import java.util.*;
class website 
{
    public static void main(String ar[])
    {
    Scanner sc=new Scanner(System.in);
    String url,type;
    System.out.println("Enter website:");
    url=sc.nextLine();
    //System.out.println(url.indexOf(":"));
    String protocol=url.substring(0,url.indexOf(":"));
    type=url.substring(url.lastIndexOf(".")+1,url.length());

    
    System.out.printf("\nprotocol: %s\n",protocol);
    System.out.println("type: "+type);

    if (protocol.matches("http")) 
    System.out.println("Protocol:- Hyper text transfer protocol");
    else if(protocol.matches("ftp"))
    System.out.println("Protocol:- File transfer protocol");
    else if(protocol.matches("https"))
    System.out.println("Protocol:- Hyper text transfer protocol security");
    else
    System.out.println("unknown protocol");

    if (type.matches("com")) 
    System.out.println("Commercial Website");
    else if(type.matches("gov"))
    System.out.println("Government website");
    else if(type.matches("org"))
    System.out.println("organizations website");
    else if(type.equals("net"))
    System.out.println("Networking Website");
    else
    System.out.println("Unknown type");
    }
}
