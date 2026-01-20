//Create a program to print the multiplication table of a given number.
package ex_10_Looping_Statements;

public class P02_ForLoop_Multiplication_table {
    public static void main() {
        int value = 0;
        for(int i=1; i<=10; i++){
            value = 6*i;
            System.out.println("6 x "+i+" = "+value);
        }
    }
}
