class revmthd
{   
    static int rev(int t)
    {
        int s=0,r;
        while(t>0)
        {
            r=t%10;
            s=s*10+r;
            t=t/10;
        }
        return s;
    }

    static void rev(int A[])
    {
        int i,t,x;
        x=A.length-1;
        for(i=0;i<=A.length/2;i++)
        {
            t=A[i];
            A[i]=A[x];
            A[x]=t;
            x--;
        }
        
    }
    public static void main(String ar[] )
    {
        int x,r[]={2,3,4,5,5,6,7};
        x=13883;
        System.out.println("rev="+rev(x));
        rev(r);
        for(int b:r)
        {
            System.out.printf("%d\t",b);
        }
    }
    
}
