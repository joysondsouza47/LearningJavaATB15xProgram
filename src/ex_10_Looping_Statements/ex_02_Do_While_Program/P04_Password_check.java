package ex_10_Looping_Statements.ex_02_Do_While_Program;

import java.util.Objects;
import java.util.Scanner;

public class P04_Password_check {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String password;
        int attempt = 0;

        do {

            System.out.println("Enter the password");
            password = sc.nextLine();
            attempt++;
            if (password.equals("joyson")) {
                System.out.println("user entered correct password");
                break;
            }
            else if (attempt>=5) {
                System.out.println("User entered wrong password more than 5 times");
                System.out.println("Account blocked please contact with Admin team to unlock your account");
                break;
            }
            else {
                System.out.println("Entered wrong password try again");
            }

        }while(attempt<=5);

        System.out.println("User tried password "+attempt+" times");
    }
}
