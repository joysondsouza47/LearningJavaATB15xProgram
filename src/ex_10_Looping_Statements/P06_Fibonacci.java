// Create a program to print the Fibonacci series up to N terms.
package ex_10_Looping_Statements;

public class P06_Fibonacci {
    static void main() {
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
//Fibonacci Series up to 10 terms:
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34,