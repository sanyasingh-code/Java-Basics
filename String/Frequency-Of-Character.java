import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = "hello";
        System.out.println("Enter the character to know its frequency:");
        char ch = in.next().charAt(0);
        int count = 0;
        
        for(int i=0; i<str.length(); i++)
        {
                if(str.charAt(i) == ch)
                {
                    count++;
                }
        }
            System.out.println("Frequency: " +count);
    }
}
