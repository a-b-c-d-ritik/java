import java.lang.*;
import java.util.*;

class student1 
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



    public static void main(String arg[])
    {
        

    }
}
