class nestedcatch {
    int a[]={10,20,30,0};
    try
    {
        int c=a[0]/a[2];

        System.out.println(c);
        try{
        System.out.println(a[5]);
        }
        catch(ArrayOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }

   
}
