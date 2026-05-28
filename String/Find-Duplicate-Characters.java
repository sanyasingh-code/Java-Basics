import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = "Sanya Singh";
        int len = str.length();
        System.out.println("Duplicate characters:");
        for(int i=0; i<len; i++)
        {
            int count = 0;
            for(int j=0; j<i; j++)
            {
                if(str.charAt(i)==str.charAt(j))
                count++;
            }
            if(count!=0)
            {
                System.out.println(str.charAt(i));
            }
        }
    }
}
