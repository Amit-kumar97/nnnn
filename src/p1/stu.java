package p1;

public class stu extends person {
    int marks;
    int rolllno;

    public stu(int marks, int rolllno,int age,String name)
    {
        super(age,name);         // call Immediate parent class constructor
        this.marks = marks;
        this.rolllno = rolllno;
        //  this.age=age;
        //    this.name=name;
    }
}
