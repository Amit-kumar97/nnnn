class parent
{
    public  static  void m1()
    {
        System.out.println("ok");
    }
}
class  child extends parent
{
    public static void m1()
    {
        System.out.println("welcome");
    }
}
public class test890 {
    public static void main(String[] args) {
        parent.m1();
        child.m1();
    }
}
