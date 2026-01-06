package ex_04_Java_basic_Program;

import java.util.Scanner;

public class P28_Ternary_Nested {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        String result = (number >= 0) ? ((number == 0) ? "number is Zero" : "Number is positive") : "Number is negative";
        System.out.println(result);
    }
}
