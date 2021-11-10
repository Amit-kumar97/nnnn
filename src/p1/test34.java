package p1;

class one{
    public  int num1=90;
}
class two extends one {
    public int num1=67;
    public void  display()
    {
        System.out.println(num1);
        // System.out.println(one.this.num1);
    }
}

public class test34 {
    public static void main(String[] args) {
        two oj= new two();
        //  oj.display();
        System.out.println(oj.num1);
        // System.out.println(super.);
    }
}
