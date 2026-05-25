import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine();
        char arr[] = str.toCharArray();
        System.out.print("Length of String: " +arr.length);
    }
}
