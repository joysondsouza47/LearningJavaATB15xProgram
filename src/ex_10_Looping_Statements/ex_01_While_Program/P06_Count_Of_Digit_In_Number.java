package ex_10_Looping_Statements.ex_01_While_Program;
import java.util.Scanner;
public class P06_Count_Of_Digit_In_Number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int num = sc.nextInt();
            int count = 0;
            while(num!=0)
            {
                num = num/10;
                count++;
            }
            System.out.println("Count of digits in a given number : " + count);
        }
        else
        {
            System.out.println("Enter the valid number");
        }

    }

}
