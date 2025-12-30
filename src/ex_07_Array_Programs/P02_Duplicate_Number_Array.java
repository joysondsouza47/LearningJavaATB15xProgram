package ex_07_Array_Programs;

import java.util.Scanner;

public class P02_Duplicate_Number_Array {
    static void main() {
        int a[] = {10,20,10,30,10,50};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int duplicate_num = sc.nextInt();
        int count = 0;

        for(int i = 0; i<a.length; i++){
            if(duplicate_num==a[i]){
                count++;
            }
        }
        System.out.println("Number is repeated "+count+" time");
    }
}
