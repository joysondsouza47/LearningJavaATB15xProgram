package ex_13_Exception_Handling;
import ex_11_OOPS_Concepts.ex_08_Encapsulation.P03_Print_statement;

import java.util.Scanner;
public class P04_throw {

    static void scan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num < 1) {
            throw new ArithmeticException("number is below 1 please enter number above 1");   // creating exception and handling it
        } else {
            System.out.println("greater than one");
        }
    }
    public static void main(String[] args)
    {
        try
        {
            P04_throw.scan();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Handled Exception");
        }

    }
}

//throw -- creating exception
//throws -- handling exception
