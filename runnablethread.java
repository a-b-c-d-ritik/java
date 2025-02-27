
class runnablethread implements Runnable
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

    public static void main(String[] args) {
        runnablethread m=new runnablethread();
        Thread t=new Thread(m);
        t.start();

        int i=1;
        while(i<20)
        {
            System.out.println(i+"main method");
            i++;
        }

    }
    
}
