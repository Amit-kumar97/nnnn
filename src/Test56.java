class i1 {

}class i2 extends i1
{

}
class i3 extends i2{

}

class  OverDemo
{
    public  void m1(i1 obj1)   // more specific class than object
    {
        System.out.println("Gla");
    }
    public  void m1(i2 obj1)
    {
        System.out.println("Hello");
    }
    //  public  void m1(i3 obj1)
    //  {
    //      System.out.println("welcome");
    // }
}
public class Test56 {
    public static void main(String[] args) {
        new OverDemo().m1(null);


    }
}
