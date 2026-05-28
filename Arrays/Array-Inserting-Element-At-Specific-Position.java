import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int arr[] = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        int pos=2, value=3;
        
        for(int i = 4; i > pos; i--)
            {
                arr[i] = arr[i-1];
            }
    
        arr[pos] = value;
    
        for(int i = 0; i < 5; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
