import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
            {
                ch = (char)(ch + 32);
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                ch = (char)(ch - 32);
            }

            System.out.print(ch);
        }
    }
}
