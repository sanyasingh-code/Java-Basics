import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8, 9, 10};
        int new_arr[] = new int[10];
        
        System.out.println("After Merging Two Arrays: ");
        
        for(int i=0; i<5; i++)
        {
           new_arr[i] = arr1[i];
        }
        
        for(int i=0; i<5; i++)
        {
           new_arr[arr1.length + i] = arr2[i];
        }
        
        for(int i=0; i<10; i++)
        {
           System.out.print(new_arr[i] + " ");
        }
    }
}
