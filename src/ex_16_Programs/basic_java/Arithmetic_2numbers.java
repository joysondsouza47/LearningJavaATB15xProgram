package ex_16_Programs.basic_java;

import java.util.Scanner;

public class Arithmetic_2numbers {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = sc.nextInt();
        System.out.println("Enter Second number");
        double b = sc.nextInt();

        System.out.println((a+b)+":Sum of two numbers");
        System.out.println((a-b)+":Difference of two numbers");
        System.out.println((a*b)+":Multiplication of two numbers");
        System.out.println((a/b)+":Division of two numbers");
        System.out.println((a%b)+":Remainder of two numbers");

        System.out.println("-----END-----d");
    }
}
