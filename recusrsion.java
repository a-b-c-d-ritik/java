class recusrsion 
{   static void fn1(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            fn1(n-1);
        }
    }
    static void fn2(int n)
    {
        if(n>0)
        {
            fn2(n-1);
            System.out.println(n);
        }
    }
    public static void main(String ar[])
    {
        fn1(5);
        fn2(5);
    }
    
}
