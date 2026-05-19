import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("Enter elements: ");
        for(int i=0; i<5; i++)
        {
            arr[i]= in.nextInt();
        }
        for(int i=0; i<5; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int min=arr[0];
        for(int i=0; i<5; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in the array: " +min);
    }
}
