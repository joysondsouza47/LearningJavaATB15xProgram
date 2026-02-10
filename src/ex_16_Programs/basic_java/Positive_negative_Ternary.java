package ex_16_Programs.basic_java;

import java.util.Scanner;

public class Positive_negative_Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        String greater_num = (a > 0) ? "a is postive number" : ((a == 0) ? "number is zero" : "number is negative");
        System.out.println(greater_num);
    }
}
