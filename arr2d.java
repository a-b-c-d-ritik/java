class arr2d {
    public static void main(String ar[])
    {
        /*int [] a,f[];
        a=new int [5];
        f=new int [6][6];
        int[][] x;
        x=new int [3][3];*/
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i,j;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.printf("%d\t",a[i][j]);
            }
            System.out.println("");
        }
        //for each
        System.out.println("");

        for(int x[]:a)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");

        }
    }
    
}
