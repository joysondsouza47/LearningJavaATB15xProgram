package ex_04_Java_basic_Program;
import java.util.Scanner;

public class P30_Ternary_Grades {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks scored : ");
        int number = sc.nextInt();
        char grades = number<90 ? (number<75 ? (number<55 ? (number< 35 ? 'F' :'D') : 'C'):'B'): 'A';
        System.out.println("My grade is : " + grades);
    }
}
