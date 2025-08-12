class A
{
    int add(int a, int b)
    {
        return (a+b);
    }
    double add(double a, double b)
    {
        return (a+b);
    }
}

public class method_overloading 
{

    public static void main(String[] args) 
    {
        A ob = new A();
        int c = ob.add(23, 45);
        double d = ob.add(3.4, 7.6);
        System.out.println(c+" "+d);
    }
}
