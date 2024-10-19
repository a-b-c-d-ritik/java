public class test
{
public static void main(String arg[])
{
int x=10,y=20;
float a=12.6f;
char z='d';
System.out.println("sum is "+x+y);
System.out.println("sum is "+(x+y));
System.out.println("sum of "+x+" and "+y+" is "+(x+y));
System.out.printf("Hello %d %f %c world\n",x,a,z);
System.out.printf("%g",a);
System.out.printf("%d\t%o\t%x\n",x,x,x);
System.out.printf("%1$d\t%1$o\t%1$x\n",x);

}
}