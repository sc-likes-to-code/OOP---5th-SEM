abstract class A
{
    abstract void print();
    void p2()
    {
        System.out.println("Printing using non-abstract method");
    }
}

class B extends A
{
    void print()
    {
        System.out.println("We are implementing data abstraction");
    }
}

public class abs_class
{
    public static void main(String[] args) 
    {
        A obj = new B();
        obj.print();
        obj.p2();
    }
}
