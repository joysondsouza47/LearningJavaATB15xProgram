package ex_04_Java_basic_Program;

import java.util.Scanner;

public class P39_Switch_operators {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the a value");
        int a = scanner.nextInt();
        System.out.println("enter the b value");
        int b = scanner.nextInt();
        System.out.println("enter the operator to be used");
        char sign = scanner.next().charAt(0);

        switch (sign){
            case '+': {
                System.out.println(a+b);
                break;
            }
            case '-':{
                System.out.println(a-b);
                break;
            }
            case '%':{
                System.out.println(a%b);
                break;
            }
            case '/':{
                System.out.println(a/b);
                break;
            }
            case '*':{
                System.out.println(a*b);
                break;
            }
            default:{
                System.out.println("invalid operator");
            }
        }
    }
}
