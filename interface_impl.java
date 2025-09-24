interface A23
{
    void fun();
}

interface B23
{
    void fun2();
}

class C23 implements A23, B23
{
    public void fun()
    {
        System.out.println("Hello, I'm A23");
    }
    
    public void fun2()
    {
        System.out.println("Hello, I'm B23");
    }
}

public class interface_impl
{
    public static void main(String[] args) 
    {
        A23 ref1;
        B23 ref2;
        ref1 = new C23();
        ref2 = new C23();
        ref1.fun();
        ref2.fun2();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    }
}
