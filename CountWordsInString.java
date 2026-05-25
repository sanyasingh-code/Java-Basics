import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = "Sky is Blue and Beautiful";
        int len = str.length();
        int space=0;
        for(int i=0; i<len; i++)
        {
            char ch = str.charAt(i);
            if(ch==' ')
            space++;
        }
        int word = space + 1;
        System.out.println("Number of words:" +word);
    }
}
