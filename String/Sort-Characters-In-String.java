import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine();
        char arr[] = str.toCharArray();
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted string: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]);
        }
    }
}
