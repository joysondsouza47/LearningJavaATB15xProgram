package ex_04_Java_basic_Program;
import java.util.Scanner;
public class P34_Ifelse_Discount {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("MRP of the product is : ");
        double amount = sc.nextInt();
        if(amount >= 5000){
            System.out.println("Total discount received on the MRP is 20% and your final price is : " + amount * 0.20 + "\u20B9");  // "\u20B9"  rupee code
        }
        else if (amount >= 2000) {
            System.out.println("Total discount received on the MRP is 10% and your final price is : " + amount * 0.10 + "\u20B9");
        }
        else {
            System.out.println("Total discount received on the MRP is 5% and your final price is : " + amount * 0.05 + "\u20B9");
        }

    }
}
