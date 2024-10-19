class quantifiers
{
    public static void main(String arg[])
    {
        String s1="kahjsh";
        System.out.println(s1.matches(".*"));
        System.out.println(s1.matches("[a-z]*"));
        System.out.println(s1.matches("[a-z]+"));

        String s2="aabbcccc";
        System.out.println(s2.matches("[abc]{4}"));


    }
}