package ex_04_Java_basic_Program;
import java.util.Scanner;
public class P38_Switch_Days {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()) {
        switch (scanner.nextInt()) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("number is not between 1 to 7");
            }
        }
    }
        else
        {
        System.out.println("invalid integer");
        }
    }
}
