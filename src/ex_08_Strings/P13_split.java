package ex_08_Strings;

import java.util.Arrays;

public class P13_split {
    public static void main(String[] args)
    {
        String s = "my name is joyson dsouza";
        String [] name = s.split(" ");
        //System.out.println(name); gives memory reference
        //System.out.println(Arrays.toString(name));
        for (String display : name)
        {
            System.out.println(display);
        }
    }
}

// here split method splits string value into multiple values based on the regex we provide
//regex means a character or space  used to split the value