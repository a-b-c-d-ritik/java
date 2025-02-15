class outer
{
    static int x=10;
    int y=20;

    static class inner
    {
        void display()
        {
            System.out.println(x);
            //System.out.println(y);
        }
    }
}

class staticclass {
    public static void main(String[] args) {
        outer.inner i=new outer.inner();
        i.display();
    }
}
