import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String str = in.nextLine();
        int len = str.length();
        
        for(int i=len-1; i>=0; i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}
