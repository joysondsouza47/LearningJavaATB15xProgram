package ex_04_Java_basic_Program;
import java.util.Scanner;

public class P31_Ifelse_Number_status {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        if(number >= 0){
            if(number == 0){
                System.out.println("Number is zero");
            }
            else{
                System.out.println("Number is positive");
            }
        }
        else{
            System.out.println("Number is negative");
        }
    }
}
