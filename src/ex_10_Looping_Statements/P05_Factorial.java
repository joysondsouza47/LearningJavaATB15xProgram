// Write a program to calculate factorial of a number.
package ex_10_Looping_Statements;
import java.util.Scanner;

public class P05_Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial program");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                System.out.println(fact * i);
                fact = fact * i;
            }
        } else {
            System.out.println("given input is not valid");
        }
        scanner.close();
    }
}

