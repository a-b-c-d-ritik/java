class parent
{
    public parent()
    {
        System.out.println("parent non-param constructor");
    }

    public parent(int t)
    {
        System.out.println("parent param constructor");
    }

    
    public parent(int a,int b)
    {
        System.out.println("parent 2 param constructor");
    }


}

class child extends parent
{
    public child()
    {
        System.out.println("child non-param constructor");
    }

    public child(int y)
    {   super(y);
        System.out.println("child param constructor");
    }

    public child(int y,int z)
    {   super(y,z);
        System.out.println("child 2 param constructor");
    }


}

class grandchild extends child
{
    public grandchild()
    {
        System.out.println("grandchild constructor");
    }
}
class inheritconst 
{
    public static void main(String ar[])
    {
        parent p= new parent();
        child c=new child(20,30);
        grandchild g=new grandchild();
    } 
    
}
