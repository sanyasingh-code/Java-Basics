 import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = in.nextLine();
        int len = s.length();
        for(int i=0; i<len; i++)
        {
            int c=0;
            for(int j=0; j<len; j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    c++;
                }
            }
             if(c == 1)
            {
                System.out.println("First Non-Repeating Character: " + s.charAt(i));
                break;
            }
        }
    }
}
