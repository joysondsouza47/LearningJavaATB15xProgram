package ex_05_Java_Main_Programs;
import java.util.Scanner;

public class P01_Triangle_Types {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First value : ");
        int S1 = scanner.nextInt();
        System.out.print("Enter the Second value : ");
        int S2 = scanner.nextInt();
        System.out.print("Enter the Third value : ");
        int S3 = scanner.nextInt();

        if(S1==S2 && S1==S3){
            System.out.println("This is an Equilateral Triangle");
        }
        else if (S1==S2 || S1==S3 || S2==S3) {
            System.out.println("This is an isosceles triangle");
        }
        else{
            System.out.println("This is Scalene triangle");
        }
    }
}
