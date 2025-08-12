class A
{
    int calc(int a, int b)
    {
        return (a+b);
    }
}

class B extends A
{
    int calc(int a, int b)
    {
        return (a-b);
    }
}

public class method_overriding 
{
    public static void main(String[] args) 
    {
        A ref;
        B ob = new B();
        ref = ob;
        int diff = ref.calc(13, 3);
        System.out.println("Result: "+diff);
    }
}
