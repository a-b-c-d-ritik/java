class phone
{
    void call()
    {
        System.out.println("Ringing...");
    }
    void Sms()
    {
        System.out.println("Beeping...");
    }
}

interface Icamera
{
    void click();
    void record();
}

interface Music
{
    void play();
    void pause();
    void stop();
}

class smartphone extends phone implements Icamera,Music
{
    void videocall()
    {
        System.out.println("video calling");
    }
    public void click()
    {
        System.out.println("photo captured");
    }
    public void record()
    {
        System.out.println("Recording...");
    }
    public void play()
    {
        System.out.println("Music Playing...");
    }
    public void pause()
    {
        System.out.println("Music paused");
    }
    public void stop()
    {
        System.out.println("Music stopped");
    }

}
class smartphonerun 
{
    public static void main(String ar[])
    {
        smartphone s=new smartphone();
        s.Sms();
        phone p=s;
        System.out.println(p);
    }
}
