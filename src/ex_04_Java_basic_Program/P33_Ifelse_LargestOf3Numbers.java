package ex_04_Java_basic_Program;
import java.util.Scanner;
public class P33_Ifelse_LargestOf3Numbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the Third number : ");
        int num3 = sc.nextInt();


        if (num1 == num2 && num2 ==num3) {
            System.out.println("All numbers are same");
        }
        else if(num1>=num2){
            if(num1>=num3){
                System.out.println("First number is greater :" + num1);
            }
            else{
                System.out.println("Third number is greater :" + num3);
            }
        }
        else if (num2>=num3) {
            System.out.println("Second number is greater :" + num2);
        }
        else {
            System.out.println("Third number is greater :" + num3);
        }


    }
}
