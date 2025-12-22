package ex_04_Java_basic_Program;

public class P16_Leap_Year {
    static void main() {
        int year = 2027;

        if((year%400 ==0) || (year%4 == 0 && year%100 != 0)){
            System.out.println("year is a leap year");
        }
        else {
            System.out.println("year is not a leap year");
        }
    }
}

// output
// logic
// leap year means a year consist of 366 days instead of 365 this occurs every 4 years
// this day id adjusted in the february month 28/29 days(29-leap year)
//if a year to be leap year
//        1. year needs to be divisible by 400
//                          or
//        2. year needs to be divisible by 4 and not divisible by 100