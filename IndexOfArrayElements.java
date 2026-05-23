import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        for(int i=0; i<5; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Index of array elements:");
        for(int i=0; i<5; i++)
        {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
}
