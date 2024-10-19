class bitmasking
{
    public static void main(String arg[])
    {
        int a=5,b=9,c=0;
        System.out.println(String.format("%s",Integer.toBinaryString(c)));
        c=c|a;
        b=b<<4;
        c=c|b;
        System.out.println(String.format("%s",Integer.toBinaryString(c)));
    }
}