class Test 
{
    void checkAge(int age) throws ArithmeticException 
    {
        if (age < 18) 
        {
            throw new ArithmeticException("Not eligible to vote");
        } 
        else 
        {
            System.out.println("Eligible to vote");
        }
    }
}

public class throw_throws
{
    public static void main(String[] args) 
    {
        Test t = new Test();
        try 
        {
            t.checkAge(15);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Exception caught: " + e);
        }
        t.checkAge(20);
    }
}