package ex_09_String_programs;
import java.util.Arrays;

public class P06_vowels_Consonants {
    public static void main(String [] args)
    {
        String s = "joyson";
        int vowels = 0, consonants = 0;
        s = s.toLowerCase();

        for(char arr : s.toCharArray())
        {
            if(arr>='a' && arr<='z')
            {
                if("aeiou".indexOf(arr)!= -1)
                {
                    vowels++;
                }
                else
                {
                   consonants ++;
                }
            }
        }
        System.out.println("number of vowels in the string value is : " +vowels);
        System.out.println("number of consonants in the string value is : " +consonants);
    }
}

