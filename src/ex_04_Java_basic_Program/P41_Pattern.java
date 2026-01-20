package ex_04_Java_basic_Program;

public class P41_Pattern {
    public static void main(String [] args)
    {
        for(int i=1;i<=5;i++)
        {
            if(i==1)
            {
                System.out.println("*");
            }
            else if (i==2)
            {
                System.out.println("**");
            }
            else if (i==3)
            {
                System.out.println("***");
            }
            else if (i==4)
            {
                System.out.println("****");
            }
            else
            {
                System.out.println("*****");
            }

        }
    }
}
