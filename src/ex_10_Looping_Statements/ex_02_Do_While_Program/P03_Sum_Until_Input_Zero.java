package ex_10_Looping_Statements.ex_02_Do_While_Program;

import java.util.Scanner;

public class P03_Sum_Until_Input_Zero {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
            int sum = 0;
            int num = 0;
            do {
                System.out.println("Enter the number");
                if (sc.hasNextInt()) {
                    num = sc.nextInt();
                    sum = sum + num;
                    if(num==0){
                        System.out.println("user entered Zero as input");
                        break;
                    }
                    System.out.println("Entered number is : " + num + "\nAdding this number with next Input until we user gives Zero as Input");
                } else {
                    System.out.println("Invalid input");
                }
            } while (num != 0);
            System.out.println("sum of numbers given by User : " + sum);
    }
}
