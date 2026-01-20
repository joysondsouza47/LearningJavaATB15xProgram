package ex_08_Strings;

public class P10_Trim {
    public static void main(String[] args)
    {
        String s = "  joyson dsouza  ";
        System.out.println(s.trim());
        //s = s.trim(); // assigning alone changes the value no other methods without assigning can change the value.
        System.out.println(s); //immutable prints the original value
    }
}


// trim function removes unwanted spaces from starting and end of the object.
