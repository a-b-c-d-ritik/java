import java.lang.*;
import java.util.*;

class access
{
    int roll,i;
    String name;
    float marks[];
    String section;

    void createmaster()
    {
      System.out.println("create method activated/");
      Scanner p= new Scanner(System.in);
      Scanner s= new Scanner(System.in);
      System.out.print("Enter roll:");
      roll=p.nextInt();
      System.out.print("Enter name:");
      name=s.nextLine();
        
      float marks[]=new float[5];
      for(i=0;i<5;i++)
      {
      System.out.println("Enter marks of subject "+(i+1)+" :");
      marks[i]=p.nextFloat();
      }

      System.out.println("Enter section:");
      section=s.next();

    }

    void listall()
    {
        System.out.println("listall method activated/");
        Scanner p= new Scanner(System.in);
        Scanner s= new Scanner(System.in);
        



    }

    void edit_entry()
    {

    }

    void append()
    {

    }

    void delete_entry()
    {

    }

    void search_entry()
    {

    }

    void sort_entry()
    {

    }



}





public class student
{
    public static void main(String arg[])
    {   int no,val,j,e;
        Scanner x= new Scanner(System.in);
        System.out.println("Enter no of Students:");
        no=x.nextInt();
        access t[]= new access[no];
        //System.out.println(t.length);
        System.out.println("Select the task:");
        System.out.printf("\n1.Createmaster\n2.Listall\n3.Edit_Entry\n4.Append\n5.Delete_Entry\n6.Search_Entry\n7.Sort_Entry");
        val=nextInt();
        j=0;
        while(no==t.length)
        {
            switch(val) 
            {
                case 1:
                    t[j].createmaster();
                    break;
                case 2:
                    t[j].
            
                default:
                    break;
            }
        }
    }
    
}
