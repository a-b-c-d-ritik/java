abstract class my
{
    abstract void display();
}

class outer1
{
    public void methd()
    {
        my m=new my(){
            public void display()
            {
                System.out.println("display");
            }
        };

        m.display();
    }
}
class anonymousclass {
    public static void main(String[] args) {
        outer1 o=new outer1();
        o.methd();
        
    }
}
