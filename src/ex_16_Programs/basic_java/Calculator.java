package ex_16_Programs.basic_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("Enter valid symbol for calculation");
        try {
            switch (sc.next()) {
                case ("+"): {
                    System.out.println(a+b);
                    break;
                }
                case ("-"): {
                    System.out.println(a-b);
                    break;
                }
                case ("*"): {
                    System.out.println(a*b);
                    break;
                }
                case ("/"): {
                    System.out.println(a/b);
                    break;
                }
                case ("%"): {
                    System.out.println(a%b);
                    break;
                }
                default: {
                    System.out.println("no valid symbol");
                    break;
                }
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("invalid input");
        }
    }
}
