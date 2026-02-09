package ex_16_Programs.basic_java;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
//      int b = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("Given number is Even");
        }
        else
        {
            System.out.println("Given number is odd");
        }
    }
}
