import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine();
        System.out.print("Enter old character: ");
        char oldch = in.next().charAt(0);
        System.out.print("Enter new character: ");
        char newch = in.next().charAt(0);
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == oldch)
            {
                System.out.print(newch);
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}
