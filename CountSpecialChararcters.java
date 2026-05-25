import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(!Character.isLetterOrDigit(ch) && ch != ' ')
            {
                count++;
            }
        }
        System.out.println("Special characters: " + count);
    }
}
