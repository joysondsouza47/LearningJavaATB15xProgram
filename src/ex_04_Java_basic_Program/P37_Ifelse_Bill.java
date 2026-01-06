package ex_04_Java_basic_Program;

import java.util.Scanner;

public class P37_Ifelse_Bill {
        static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the consumed Units : ");
            int unit = sc.nextInt();
            if(unit <= 100){
                System.out.println("Total electricity amount is : " + unit * 2 + "\u20B9");  // "\u20B9"  rupee code
            }
            else if (unit <= 200) {
                System.out.println("Total electricity amount is : " + ((unit-100)*3 + 100*2) + "\u20B9");
            }
            else {
                System.out.println("Total electricity amount is : " + ((unit-200)*5 + 100*3 + 100*2 ) + "\u20B9");
            }

        }
}