package ex_10_Looping_Statements.ex_01_While_Program;
import java.util.Scanner;
public class P04_Palindrome {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt())
        {
            int num = sc.nextInt();
            int original_num = num;
            int reverse = 0;
             while(num!=0){
                 reverse = reverse * 10 + num%10;
                 num = num/10;
             }
            if(original_num == reverse){
                System.out.println("Given number is a Palindrome number");
            }
            else{
                System.out.println("Given number is not a Palindrome number");
            }
        }
        else
        {
            System.out.println("Enter a valid integer value");
        }
    }
}
