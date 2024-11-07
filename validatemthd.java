public class validatemthd 
{
    static boolean validate(String nm)
    {
        if(nm.matches("[A-Za-z\s]+"))
        return true;
        else
        return false;
    }

    static boolean validate( int t)
    {
        return t>=5 && t<=21;
    }

    public static void main(String ar[])
    {
        String name="Raju Shrivastav";
        if(validate(name))
        System.out.println("ok");
        else
        System.out.println("mistake");

        int age=6;
        if(validate(age))
        System.out.println("ok");
        else
        System.out.println("mistake");



    }
    
}
