class hexadecimalcheck 
{
    public static void main(String arg[])
    {
        String s="123ABCDEF";
        System.out.println(s.matches("[0-9]*[A-F]*"));
    }
    
}
