public class try__multiple_catch
{
    public static void main(String[] args) 
    {
        try 
        {
            int arr[] = new int[5];
            arr[5] = 10 / 0;
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic Exception: " + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array Index Out of Bounds: " + e);
        } 
        catch (Exception e) 
        {
            System.out.println("General Exception: " + e);
        }
    }
}