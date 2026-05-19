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
        int max1=arr[0], max2=arr[1];
        for(int i=0; i<5; i++)
        {
            if(max1 < arr[i])
            {
                max2 = max1;
                max1 = arr[i];
            }
        }
        System.out.println("Largest element in the array: " +max1);
        System.out.println("Second largest element in the array: " +max2);
    }
}
