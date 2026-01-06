package ex_04_Java_basic_Program;
import java.util.Scanner;
public class P32_Ifelse_Eligible_to_Vote {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person : ");
        int age = sc.nextInt();
        boolean voterId = false;
        if(age>=18){
            if(voterId){
                System.out.println("Person can vote.");
            }
            else{
                System.out.println("Person must have an voterId to cast the vote.");
            }
        }
        else {
            System.out.println("Person is not eligible to cast the vote.");
        }

    }
}
