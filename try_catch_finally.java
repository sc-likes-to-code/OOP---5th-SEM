public class try_catch_finally 
{
    public static void main(String[] args) 
    {
        try 
        {
            int a = 10 / 0;
        } 
        catch (ArithmeticException e)
        {
            System.out.println("Caught Exception: " + e);
        }

        try 
        {
            int b = 20;
            System.out.println("Value: " + b);
        } 
        finally 
        {
            System.out.println("Finally block executed");
        }

        try
        {
            String s = null;
            System.out.println(s.length());
        } 
        catch (NullPointerException e) 
        {
            System.out.println("Caught NullPointerException");
        } 
        finally 
        {
            System.out.println("Finally always executes");
        }
    }
}