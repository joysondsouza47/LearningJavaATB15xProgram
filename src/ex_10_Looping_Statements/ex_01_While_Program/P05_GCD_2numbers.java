package ex_10_Looping_Statements.ex_01_While_Program;

public class P05_GCD_2numbers {
    public static void main(String[] args)
    {
        int a = 12;
        int b = 56;

        while(b!=0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD : " + a);
    }
}
