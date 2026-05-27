import java.util.*;
class Main
{
    static int binarySearch(int arr[], int start, int end, int key)
    {
        if(start > end)
        return -1;

        int mid = (start + end) / 2;

        if(arr[mid] == key)
        return mid;

        if(key < arr[mid])
        return binarySearch(arr, start, mid - 1, key);

        return binarySearch(arr, mid + 1, end, key);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50, 60};
        System.out.print("Enter element to search: ");
        int key = in.nextInt();
        int result = binarySearch(arr, 0, arr.length - 1, key);

        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index: " + result);
        }
    }
}
