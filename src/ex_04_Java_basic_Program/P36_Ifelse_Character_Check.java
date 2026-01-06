package ex_04_Java_basic_Program;
import java.util.Scanner;

public class P36_Ifelse_Character_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.println(ch);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Letter");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }

        sc.close();
    }
}

