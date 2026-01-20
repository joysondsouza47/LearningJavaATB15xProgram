package ex_09_String_programs;

public class p07_Occurrence_character {
    public static void main(String[] args)
    {
        String s = "joyson  dsouza";
        char [] a = s.toCharArray();
        int [] count = new int[256];

        for(char s1 : a){
            count[s1]++;
        }

        for(int i=0; i< count.length; i++)
        {
            if(count[i]>0) {
                System.out.println((char)i + "=" + count[i]);
            }
        }
    }
}
