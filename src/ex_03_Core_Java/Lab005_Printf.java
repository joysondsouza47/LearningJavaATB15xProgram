package ex_03_Core_Java;

public class Lab005_Printf {
    public static void main() {
        int num = 9;

        System.out.println("Multiplication of 9");

        System.out.printf("%d x  1 = %2d%n",num,num);
        System.out.printf("%d x  2 = %d%n",num,num*2);
        System.out.printf("%d x  3 = %d%n",num,num*3);
        System.out.printf("%d x  4 = %d%n",num,num*4);
        System.out.printf("%d x  5 = %d%n",num,num*5);
        System.out.printf("%d x  6 = %d%n",num,num*6);
        System.out.printf("%d x  7 = %d%n",num,num*7);
        System.out.printf("%d x  8 = %d%n",num,num*8);
        System.out.printf("%d x  9 = %d%n",num,num*9);
        System.out.printf("%d x 10 = %d%n",num,num*10);

        System.out.println("my name is joyson\ncurrently am working in IT"); // new line
        System.out.println("hello\tworld"); // tab space
        System.out.println("hello world");  // normal space
        System.out.println("helloo\b world"); // remove a char
        System.out.println("hello\rworld");  // Carriage Return delete characters in front
    }
}
