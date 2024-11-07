
class method2 {

    int max(int x,int y)
     {
         if(x>y)
         return x;
         else
         return y;
     }
 
     public static void main(String ar[])
     {
         int a=7,b=10;
         method2 mp=new method2();
         System.out.println("Max is "+mp.max(a, b));
     }
     
 }
 