class super1
{
    super1()
    {
        System.out.println("Super1 const");
    }
    void display()
    {
        System.out.println("super1 display");
    }
}

class sub1
{
    sub1()
    {
        System.out.println("Sub1 const");
    }
     
    void display()
    {
        System.out.println("sub1 display");
    }
}

class methdovrriding 
{
    public static void main(String ar[])
    {
        super1 s1=new super1();
        s1.display();
        sub1 s2=new sub1();
        s2.display();
        super1 s3=new sub1();
        s3.display();
    }
    
}
