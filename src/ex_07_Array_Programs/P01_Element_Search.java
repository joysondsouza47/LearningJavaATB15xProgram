package ex_07_Array_Programs;
import java.util.Scanner;

public class P01_Element_Search {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 20, 30, 40, 50};
        int search_num = sc.nextInt();  // input by user
        int count = 0;

        for(int i = 0; i<a.length; i++){
            if(search_num==a[i]){
                System.out.println("number found in index :" + i);
                count++;
                break;
            }

        }
        if(count==0){
            System.out.println("number not found");
        }

    }
}
