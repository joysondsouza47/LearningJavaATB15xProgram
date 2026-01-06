// Write a program to calculate factorial of a number.
package ex_10_Looping_Statements;

public class P05_Factorial {
    static void main() {
        int n = 10;
        int fac= 1;
        for(int i=1;i<=n;i++){
            System.out.println(i+" * "+fac);
            fac = fac*i;
        }
        System.out.println("n factorial is :" + fac);
    }
}
