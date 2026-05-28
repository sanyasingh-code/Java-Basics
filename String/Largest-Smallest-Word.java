import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String str = in.nextLine();
        String arr[] = str.split(" ");
        String largest = arr[0];
        String smallest = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].length() > largest.length())
            {
                largest = arr[i];
            }
            if(arr[i].length() < smallest.length())
            {
                smallest = arr[i];
            }
        }
        System.out.println("Largest word: " + largest);
        System.out.println("Smallest word: " + smallest);
    }
}
