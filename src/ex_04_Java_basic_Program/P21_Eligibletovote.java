package ex_04_Java_basic_Program;

public class P21_Eligibletovote {
    static void main() {
        int age = 34;
        boolean voterid = false;
        if (age>=18){
            if(voterid){
                System.out.println("person is eligible to vote");
            }
            else{
                System.out.println("get a voter id to cast the vote");
            }
        }
        else{
            System.out.println("not eligible to vote");
        }
    }
}
