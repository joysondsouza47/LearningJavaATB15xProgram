package ex_10_Looping_Statements.ex_02_Do_While_Program;

public class P01_Print_Number_1_10 {

    public static void main(String[] args)
    {
        int i = 1;
        System.out.println("---Start of program---");
        do
        {
            System.out.println(i);
            i++;
        }
        while(i<=10);
        System.out.println("---END---");
    }
}
