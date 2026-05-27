import java.util.*;
class Main
{
    static void reverse(String str, int i)
    {
        if(i < 0)
        return;

        System.out.print(str.charAt(i));
        reverse(str, i - 1);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine();
        reverse(str, str.length() - 1);
    }
}
