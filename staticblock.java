class mystatic
{
    static int t;

    static{
        System.out.println("Block 1");
        t=10;
    }

    static
    {
        System.out.println("Block 2");
    }

    void show()
    {
        System.out.println("show method");
    }
}
class staticblock {
    public static void main(String[] args) {
        mystatic s=new mystatic();
        s.show();
    }
    }
    

