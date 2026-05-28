import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = in.nextLine();
        String arr[] = str.split(" ");
        for(int i = 0; i < arr.length; i++)
        {
            String word = arr[i];
            for(int j = word.length() - 1; j >= 0; j--)
            {
                System.out.print(word.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
