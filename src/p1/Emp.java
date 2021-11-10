package p1;

public class Emp extends person {
    int eid;
    int sal;
    public Emp(int eid,int sal, int age,String name)
    {
        super(age,name);
        this.eid=eid;
        this.sal=sal;
    }

}
