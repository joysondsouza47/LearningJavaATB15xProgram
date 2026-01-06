package ex_04_Java_basic_Program;

import java.util.Scanner;

public class P27_Ternary_MaxNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x value : ");
        int x = sc.nextInt();
        System.out.print("Enter the y value : ");
        int y = sc.nextInt();

        boolean result = (x>=y)? true : false;

        System.out.println(result);
    }
}
