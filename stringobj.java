import java.lang.*;
public class stringobj {
    public static void main(String arg[])
    {
        String s1="java java";
        System.out.printf("%s\n",s1);

        String s2= new String("Java lang");
        System.out.println(s2);

        char c[]={'h','e','l','l','o'};
        String s3 = new String(c);
        System.out.println(s3);

        byte b[]={65,66,67,68,69};
        String s4 = new String(b);
        System.out.println(s4);




    }
    
}
