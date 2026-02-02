package ex_13_Exception_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P02_try_catch {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program started....");


        try
        {
            int a[] = new int[5];
            System.out.println("Enter the number (0to4) :");
            int pos = sc.nextInt();
            System.out.println("Enter the value");
            int value = sc.nextInt();
            a[pos] = value;
            System.out.println(a[pos]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("exception handled");
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e)
        {
            System.out.println("handled exception");
        }

        System.out.println("Program completed....");



    }
}
