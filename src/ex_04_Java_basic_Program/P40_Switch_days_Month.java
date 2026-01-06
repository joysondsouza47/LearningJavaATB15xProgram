package ex_04_Java_basic_Program;

import java.util.Scanner;

public class P40_Switch_days_Month {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the month number");
        int month = scanner.nextInt();
        System.out.println("Enter the current year");
        int year = scanner.nextInt();
        int days = 0;
        switch(month){
            case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
            {
                days = 31;
                System.out.println(days+" Days in this month");
                break;
            }
            case 2: {
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                    System.out.println(days+" Days in this month");
                } else {
                    days = 28;
                    System.out.println(days+" Days in this month");
                }
                break;
            }
            case 4: case 6: case 9: case 11:{
                days =30;
                System.out.println(days+" Days in this month");
                break;
            }
            default: {
                System.out.println("Invalid month");
            }
        }
    }
}
