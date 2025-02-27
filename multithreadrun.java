class mythread extends Thread
{
    public void run()
    {
        int i=1;
        while(i<20)
        {
            System.out.println(i+"run method");
            i++;
        }
    }
}
class multithreadrun {
    public static void main(String[] args) {
        mythread m=new mythread();
        m.start();

        int i=1;
        while(i<20)
        {
            System.out.println(i+"main method");
            i++;
        }

    }
    
}
