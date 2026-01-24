package ex_04_Java_basic_Program;

import java.util.Scanner;

public class P43_start_pyramid {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("enter the number n");
        int n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("welcome");
        }
    }
}