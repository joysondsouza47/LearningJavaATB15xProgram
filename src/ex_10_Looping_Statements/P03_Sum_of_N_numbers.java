// Write a program to calculate the sum of first N natural numbers.
package ex_10_Looping_Statements;

public class P03_Sum_of_N_numbers {
    static void main() {
        int n = 10;
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("total sum of n number is : " + sum);
    }
}
