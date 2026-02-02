package ex_13_Exception_Handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class P03_throws {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileInputStream file = new FileInputStream("D:\\joyson.txt");

        System.out.println(file.read());


    }
}
