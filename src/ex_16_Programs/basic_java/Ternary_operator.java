package ex_16_Programs.basic_java;

import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        String greaternum = (a>b)? "a is greater":"b is greater";
        System.out.println(greaternum);
    }
}
