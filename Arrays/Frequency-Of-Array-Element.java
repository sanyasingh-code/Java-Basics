import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int freq=0;
        int arr[] = {1,2,3,4,5};
        for(int i=0; i<5; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter element for checking its frequency: ");
        int element = in.nextInt();
        for(int i=0; i<5; i++)
        {
           if(arr[i] == element)
           freq++;
        }
        if(freq==0)
        System.out.println("Element not present");
        else
        System.out.println("Frequency of element: " +freq);
        
    }
}
