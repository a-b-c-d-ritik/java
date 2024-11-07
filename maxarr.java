class maxarr
{
    int max(int t[])
    {
        int mx=0,i;
        for(i=0;i<t.length;i++)
        {
            if(t[i]>mx)
            mx=t[i];
        }
        return mx;
    }
    public static void main(String ar[])
    {
        int A[]={20,55,6,99,02,66,33,25,101,3};
        maxarr obj=new maxarr();

        System.out.println("Max element is:"+obj.max(A));

    }
    
}
