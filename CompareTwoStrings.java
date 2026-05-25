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
        int c=0;
        if(s1.length() == s2.length())
        {
            for(int i=0; i<s1.length(); i++)
            {
                if(s1.charAt(i) != s2.charAt(i))
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.println("Strings are equal");
            }
            else
            {
                System.out.println("Strings are not equal");
            }
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }
}
        
