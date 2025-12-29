package ex_05_Java_Main_Programs;

import java.util.Scanner;

public class P03_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks obtained: ");
        int marks = scanner.nextInt();
        if(marks>=90) {
            System.out.println("Your grade is : A");
        }
        else if (marks>=75) {
            System.out.println("Your grade is : B");
        }
        else if (marks>=55) {
            System.out.println("Your grade is : C");
        }
        else if (marks>=45) {
            System.out.println("Your grade is : D");
        }
        else {
            System.out.println("Your grade is : F");
        }
    }
}
