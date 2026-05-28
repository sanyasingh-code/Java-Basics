import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = in.nextLine();
        System.out.print("Enter second string: ");
        String s2 = in.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int count = 0;
        if(s1.length() == s2.length())
        {
            for(int i=0; i<s1.length(); i++)
            {
                for(int j=0; j<s2.length(); j++)
                {
                    if(s1.charAt(i) == s2.charAt(j))
                    {
                        count++;
                        break;
                    }
                }
            }
            if(count == s1.length())
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not Anagram");
            }
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}
