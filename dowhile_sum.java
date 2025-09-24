import java.util.*;

public class dowhile_sum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b,s=0;
        char c;

        do
        {
            System.out.println("Enter 1st number: ");
            a=sc.nextInt();
            System.out.println("Enter 2nd number: ");
            b=sc.nextInt();
            s=a+b;
            System.out.println("Sum: "+s);
            System.out.println("Do you want to perform operation again?(Y/N)");
            c=sc.next().charAt(0);
            if (c=='Y' || c=='y')
            {
                s=0;
                continue;
            }
            else
                break;
        }while(true);
    }
}

/*
  import java.util.*;

public class DoWhileSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, s;
        char c;

        do {
            System.out.print("Enter 1st number: ");
            a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            b = sc.nextInt();
            s = a + b;
            System.out.println("Sum: " + s);

            System.out.print("Do you want to perform operation again? (Y/N): ");
            c = sc.next().charAt(0);

        } while (c == 'Y' || c == 'y');

        System.out.println("Program terminated.");
    }
} 
 */

 