import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int c=0;
        int arr[] = {1,2,3,4,5};
        for(int i=0; i<5; i++)
        {
            arr[i] = in.nextInt();
        }
        for(int i=0; i<5; i++)
        {
            if(arr[i] > arr[i+1])
            {
                c++;
                break;
            }
        }
        if(c==1)
        System.out.println("Not Sorted");
        else
        System.out.println("Sorted");
        
    }
}
