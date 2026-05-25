import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = in.nextLine();
        String arr[] = str.split(" ");
        for(int i=arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
