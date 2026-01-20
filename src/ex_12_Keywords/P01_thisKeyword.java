package ex_12_Keywords;

public class P01_thisKeyword {
    int a = 10;
    int b = 19;

    P01_thisKeyword(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
     void sum()
     {
         System.out.println(a+b);
     }

     public static void main(String[] args)
    {
        P01_thisKeyword tk = new P01_thisKeyword(2,4);
        tk.sum();
    }

}
