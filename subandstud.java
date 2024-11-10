class subject
{
    private String subid;
    private String subnm;
    private int maxmarks;
    private int obtmarks;

    public String getSubid()
    {
        return subid;
    }

    public String getsubnm()
    {
        return subnm;
    }

    public int getmaxmarks()
    {
        return maxmarks;
    }

    public int getobtmarks()
    {
        return obtmarks;
    }

    public void setobtmarks(int obt)
    {
        obtmarks=obt;
    }

    public subject(String subid,String subnm,int maxmarks)
    {
        this.subid=subid;
        this.subnm=subnm;
        this.maxmarks=maxmarks;
    }
}
/*class student
{
    private 
}*/

class subandstud
{   public static void main(String ar[])
    {
    subject s[]=new subject[3];
    s[0]= new subject("Mth101","Math",100);
    System.out.println(s[0].getSubid());
    s[0].setobtmarks(80);
    System.out.println(s[0].getobtmarks());

    }
}
