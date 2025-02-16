 //static 
class stats
 {
    static int x=10;
    int y=20;

    void show()
    {
        System.out.println(x+" "+y);
    }

    //static
     void display()
    {
        System.out.println(x);
    }
 }
 class staticrun {
    public static void main(String[] args) {
    stats s=new stats();
    s.show();
    s.display();
    s.x=5;
    s.display();
    s.show();
    }
     
}
