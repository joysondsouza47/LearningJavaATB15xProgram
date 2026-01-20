package ex_10_Looping_Statements.ex_01_While_Program;

public class P07_Num_Divisible_By_5 {
    public static void main(String[] args)
    {
        int i = 1;
        System.out.println("----Below numbers are divisible by 5----");
        while(i<=100)
        {
            if(i%5==0)
            {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("---END---");
    }
}
