class A
{
    int a;
    A(int a) 
    {
        this.a = a;
    }
    void display() 
    {
        System.out.println("Entered number is: " + a);
    }
    int sub(int x, int y)
    {
        return (x-y);
    }
}

class B extends A
{
    int y;
    B(int x, int y)
    {
        super(x);
        this.y = y;
    }
    int sub(int x, int y)
    {
        return (x-y);
    }
}

public class inheritance 
{
    public static void main(String[] args) 
    {
        B ob = new B(15,23);
        ob.display();
        int res = ob.sub(15,23);
        System.out.println("Difference is: "+res);
    }
}