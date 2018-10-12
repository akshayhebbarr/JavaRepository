
public class Rename
{
    // private methods are not overridden
    private void m1() { System.out.println("From parent m1()");}
     
    protected void m2() { System.out.println("From parent m2()"); }
}
 
class Child extends Rename
{
    // new m1() method
    // unique to Child class
    private void m1() { System.out.println("From child m1()");}
     
    // overriding method
    // with more accessibility
    @Override
    public void m2() { System.out.println("From child m2()");}
     
}
 
// Driver class
class Overrrrrride
{
    public static void main(String[] args)
    {
        Rename obj1 = new Rename();
        obj1.m2();
        Rename obj2 = new Child();
        obj2.m2();
    }
}
