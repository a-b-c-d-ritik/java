public class flag {
    public static void main(String arg[])
    {
        int a=10;
        System.out.printf("%06d\n",a);
        System.out.printf("%(6d\n",a);

        a=-10;
        System.out.printf("%6d\n",a);
        System.out.printf("%06d\n",a);
        System.out.printf("%(6d\n",a);
        System.out.printf("%+6d",a);

        float x=-6456.646f;
        System.out.printf("\n%f",x);
        System.out.printf("\n%09f",x);

        System.out.printf("\n%8.3f",x);
        System.out.printf("\n%08.3f",x);
        System.out.printf("\n%(f",x);

        String t="Java";
        System.out.printf("\n%15s",t);
        System.out.printf("\n%-15s",t);
        System.out.format("\n%-15s",t);











    }    
}
