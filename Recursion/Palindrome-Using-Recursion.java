import java.util.*;
class Main
{
    static boolean palindrome(String str, int start, int end)
    {
        if(start >= end)
        return true;
        
        if(str.charAt(start) != str.charAt(end))
        return false;

        return palindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine();

        if(palindrome(str, 0, str.length() - 1))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
