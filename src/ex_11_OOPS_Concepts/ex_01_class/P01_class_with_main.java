package ex_11_OOPS_Concepts.ex_01_class;

import java.util.Scanner;

public class P01_class_with_main {

    public static void main(String[] args){
        // int a = 10;
        // int b = 20;
        // System.out.println(a+b);

            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            Double d = scan.nextDouble();
            scan.nextLine();
            String s = scan.nextLine();

            // Write your code here.

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);

            scan.close();
    }

}

//A class is a collection of variables (data) and methods (functions)
