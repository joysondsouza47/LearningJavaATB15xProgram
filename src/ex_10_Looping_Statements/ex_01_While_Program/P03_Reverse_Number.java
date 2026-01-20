package ex_10_Looping_Statements.ex_01_While_Program;
import java.util.Scanner;
public class P03_Reverse_Number {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt())
        {
            int num = sc.nextInt();
            int reverse = 0;
             while(num!=0)
             {
                 reverse = reverse * 10 + num%10;
                 num = num/10;
             }
            System.out.println("Reverse of given number is : "+ reverse);
        }
        else
        {
            System.out.println("enter a valid integer value");
        }
    }
}
