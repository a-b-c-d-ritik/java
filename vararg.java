class vararg
{
    static void show(int ...x)
    {
        for(int t:x)
        {
            System.out.println(t);
        }
    }

    static void showList(String...s)
    {
        for(int i=0;i<s.length;i++)
        System.out.println(i+1+"."+s[i]);
    }

    static int max(int ...A)
    {
        if(A.length==0)
        return Integer.MIN_VALUE;
        int m=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>m)
            m=A[i];
        }
        return m;
    }

    static int sum(int...A)
    {
        int sum=0;
        for(int x:A)
        {
            sum=sum+x;
        }
        return sum;
    }
    public static void main(String ...ar)
    {
        show(10);
        show(10,20);
        show(10,30,68,99,36);

        show(new int[]{1,2,3,4,5,6,69});
        showList("ram","ajay","raj","jk");
        System.out.println("max is "+max());
        System.out.println("max is "+max(10,20,30,99,88,66,887,33,22));
        System.out.println("sum is "+sum(10,20,30,88,33,22));
    }
}