import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int arr[] = {1,2,2,3,1};
        for(int i=0; i<5; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.print("Array after removing duplicate elements: ");
        for(int i=0; i<5; i++)
        {
            int duplicate=0;
            for(int j=0; j<i; j++)
            {
                if(arr[i] == arr[j])
                {
                    duplicate++;
                    break;
                }
            }
            if(duplicate==0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
