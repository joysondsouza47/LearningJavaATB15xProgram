package ex_10_Looping_Statements.ex_02_Do_While_Program;

import java.util.Scanner;

public class P02_Menu_Driven_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("---welcome to the menu---");
            System.out.println("Enter respective number to select the task");
            System.out.println("1. Addition of 2 numbers");
            System.out.println("2. Subtraction of 2 numbers");
            System.out.println("3. Multiplication of 2 numbers");


            if (sc.hasNextInt(4)) {
                choice = sc.nextInt();

                switch (choice) {
                    case 1: {
                        System.out.println("You have selected Addition of 2numbers");
                        System.out.println("Enter 1st number");
                        int a = sc.nextInt();
                        System.out.println("Enter 2nd number");
                        int b = sc.nextInt();
                        System.out.println("Addition of 2 numbers is : " + (a + b));
                        break;

                    }
                    case 2: {
                        System.out.println("You have selected Subtraction of 2numbers");
                        System.out.println("Enter 1st number");
                        int a = sc.nextInt();
                        System.out.println("Enter 2nd number");
                        int b = sc.nextInt();
                        System.out.println("Subtraction of 2 numbers is : " + (a - b));
                        break;

                    }
                    case 3: {
                        System.out.println("You have selected Multiplication of 2numbers");
                        System.out.println("Enter 1st number");
                        int a = sc.nextInt();
                        System.out.println("Enter 2nd number");
                        int b = sc.nextInt();
                        System.out.println("Multiplication of 2 numbers is : " + (a * b));
                        break;
                    }
                    default: {
                        System.out.println("Enter integer between 1 to 3");
                    }
                }
                System.out.println("To continue -- Enter 1\nTo Exit -- Enter 0");


                int check = sc.nextInt();
                if(check==1)
                {
                    continue;
                }
                else if(check==0) {
                    System.out.println("---END---");
                    break;
                }
                else
                {
                    System.out.println("Invalid choice");
                    break;
                }
            }
            else
            {
                System.out.println("Enter a valid input");
                break;
            }
        } while (choice <=100);
    }
}
