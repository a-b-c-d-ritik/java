class jaggedarray {
    public static void main(String ar[])
    {
        int A[][];
        A= new int[3][];
        A[0]=new int[5];
        A[1]=new int[3];
        A[2]=new int[4];
        
        int i,j;
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    
}
