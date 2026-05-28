import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = "Sanya Singh";
        int len = str.length();
        for(int i=0; i<len; i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                System.out.print(ch);
            }
        }
    }
}
