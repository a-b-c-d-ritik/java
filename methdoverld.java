public class methdoverld 
{
    int max(int x,int y)
    {
        return x>y?x:y;
    }
    //static banao method overloading paao
    static float max(float x,float y)
    {
        return x>y?x:y;   
    }

    int max(int x, int y,int z)
    {
        return x>y && x>z?x:(y>z?y:z);
    }
 
     public static void main(String ar[])
     {
         int a=7,b=10;
         method2 mp=new method2();
        // System.out.println("Max is "+mp.max(a, b));
         System.out.println("Max is "+max(2.94f, 2.99f));
         //System.out.println("Max is "+mp.max(a, b,99));
     }
     
}
