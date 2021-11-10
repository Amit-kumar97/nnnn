interface j1
{

}
interface j2 extends j1{

}
//class j3 extends j2{


class  over
{
    public  void m1(j1 obj1)   // more specific class than object
    {
        System.out.println("Gla");
    }
    public  void m1(j2 obj1)
    {
        System.out.println("Hello");
    }
    // public  void m1(j3 obj1)
    {
        System.out.println("welcome");
    }
}

public class test32 {
    public static void main(String[] args) {
        //  new over().m1(null);
    }
}
