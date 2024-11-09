class stud
{
    public int roll;
    public String name,course;
    public int m1,m2,m3;

    public int total()
    {
        return m1+m2+m3;
    }
    
    public float avg()
    {
        return total()/3;
    }

    public String grade(int t)
    { 
        if(t>90 && t<=100 )
        return "A+";
        else if(t>80 && t<=90)
        return "A";
        else if(t>70 && t<=80)
        return "B+";
        else if(t>60 && t<=70)
        return "B";
        else if(t>=50 && t<=60)
        return "c";
        else if(t<50)
        return "pass";
        else
        return "fail";
    }
}

class rep
{
    public static void main(String ar[])
    {
        stud s=new stud();
        s.m1=50;
        s.m2=60;
        s.m3=60;

        System.out.println("total:"+s.total());;
        System.out.println("grade:"+s.grade(s.m1));;
    }
}