package ex_16_Programs.basic_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day_switch {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7");
        try {
            switch (sc.nextInt()) {
                case (1): {
                    System.out.println("Monday");
                    break;
                }
                case (2): {
                    System.out.println("Tuesday");
                    break;
                }
                case (3): {
                    System.out.println("Wednesday");
                    break;
                }
                case (4): {
                    System.out.println("Thursday");
                    break;
                }
                case (5): {
                    System.out.println("Friday");
                    break;
                }
                case (6): {
                    System.out.println("Saturday");
                    break;
                }
                case (7): {
                    System.out.println("Sunday");
                    break;
                }
                default: {
                    System.out.println("number is not between 1 to 7");
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

