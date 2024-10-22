import java.util.Scanner;

class searcharr {
    public static void main(String ar[])
    {
     int A[]=new int[5];
        int i,key;
        Scanner sc= new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.printf("A[%d]=",i);
            A[i]=sc.nextInt();
        }

            System.out.println("key=");
            key=sc.nextInt();

            for(i=0;i<A.length;i++)
            {
                if(A[i]==key)
                {
                System.out.println("key is found at index :"+i);
                break;//or System.exit(0);
                }
            }
            if(i==A.length)
            System.out.printf("key not found");
           
    }
    
}
