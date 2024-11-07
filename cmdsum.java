class cmdsum 
{
    public static void main(String arg[])
    {
        double sum=0;
        for(int i=0;i<arg.length;i++)
        {   if(arg[i].matches("[0-9\\.]+"))
            sum=sum+Double.parseDouble(arg[i]);
        }
        System.out.println("Sum total:"+(int)sum);
    }
}
