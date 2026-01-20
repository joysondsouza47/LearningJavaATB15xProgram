package ex_10_Looping_Statements.ex_01_While_Program;
import java.util.Scanner;
public class P02_Sum_Of_Digit {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        float sum = 0;
        while(i<=n)
        {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
