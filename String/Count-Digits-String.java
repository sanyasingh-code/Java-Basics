import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String str = in.nextLine();
        String str1 = str.toUpperCase();
        int len = str1.length();
        int digit=0;
        
        for(int i=0; i<len; i++)
        {
            char ch = str1.charAt(i);
            if(ch>='0' && ch<='9')
            {
                digit++;
            }
        }
        System.out.println("Number of Digits: " + digit);
    }
}
