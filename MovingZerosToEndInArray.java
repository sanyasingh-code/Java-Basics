import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int arr[] = {1, 0, 2, 0, 3, 4};
        int pos = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[pos] = arr[i];
                pos++;
            }
        }

        while(pos < arr.length)
        {
            arr[pos] = 0;
            pos++;
        }

        System.out.println("Array after moving zeros:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
