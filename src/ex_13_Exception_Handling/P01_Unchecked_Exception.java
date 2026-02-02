package ex_13_Exception_Handling;
import java.util.Scanner;

public class P01_Unchecked_Exception {
    public static void main(String[] args)
    {
        System.out.println("Program started...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid number");
        int num = sc.nextInt();
        System.out.println(100/num);
        System.out.println("Program completed...");
    }
}


// if we give invalid input exception occurs
// InputMismatchException
// ArithmeticException