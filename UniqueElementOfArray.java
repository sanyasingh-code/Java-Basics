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
        System.out.print("Unique Element in Array: ");
        for(int i=0; i<5; i++)
        {
            int c=0;
            for(int j=0; j<5; j++)
            {
                if(arr[i] == arr[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
