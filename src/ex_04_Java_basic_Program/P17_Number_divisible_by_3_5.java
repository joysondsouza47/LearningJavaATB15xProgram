package ex_04_Java_basic_Program;

public class P17_Number_divisible_by_3_5 {
    static void main() {
        int a = 30;
        if(a%3==0 && a%5==0){
            System.out.println("Number is divisible by both 3 and 5");
        }
        else{
            System.out.println("Number is not divisible by both 3 and 5");
        }
    }
}
