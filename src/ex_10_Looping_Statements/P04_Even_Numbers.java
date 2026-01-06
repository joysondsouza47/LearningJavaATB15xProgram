// Create a program to print all even numbers between 1 and 50.
package ex_10_Looping_Statements;

public class P04_Even_Numbers {
    static void main() {
        int even = 0;
        int odd = 0;

        for(int i=1; i<=50; i++){
            if(i%2==0){
                even++;
                System.out.println(i +" Is a even number");
            }
            else{
                odd++;
                System.out.println(i +" Is a odd number");
            }
        }
        System.out.println("There are total "+even+" even numbers and "+odd+ " odd number between 1 to 50.");
    }
}
