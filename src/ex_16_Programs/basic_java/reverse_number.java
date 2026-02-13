package ex_16_Programs.basic_java;

public class reverse_number {
    public static void main(String[] args)
    {
        int num = 120;
        int rev = 0;

        do {
            rev = rev * 10 + num % 10;
            num = num/10;

        }while(num>0);
        System.out.println(rev);
    }
}
