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
        System.out.println("Reverse Array: ");
        for(int i=4; i>=0; i--)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
