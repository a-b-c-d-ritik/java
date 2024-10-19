class regularexps 
{
    public static void main(String ar[])
    {
        String st="f",s1="abx";
        System.out.println(st.matches("."));
        System.out.println(st.matches("\\w"));

        System.out.println(s1.matches("."));

        System.out.println(s1.matches("[abc]"));

        
        String s2="a",s3="&",s4="A";
        System.out.println(s2.matches("[abc]"));
        System.out.println(s1.matches("[^abc]"));
        System.out.println(st.matches("[^abc]"));
        System.out.println(s2.matches("[a-z0-9]"));
        System.out.println(s3.matches("[a-z0-9]"));
        System.out.println(s4.matches("[a-zA-Z]"));
        System.out.println(s4.matches("[a-z][A-Z]"));

        String s5="aF",s6="a9";
        System.out.println(s5.matches("[a-z][A-Z]"));
        System.out.println(s6.matches("[a-z][0-9]"));

        System.out.println(s2.matches("a|b"));

        String s7="bca";
        System.out.println(s4.matches("abc"));





 









    }

    
}
