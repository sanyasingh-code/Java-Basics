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
        int sr, flag=0, mid, low=0, high=4;
        System.out.println("enter the no be searched ");
        sr= in.nextInt();
        
        while(low<=high)
        {
            mid = (low + high)/2;
            if(sr == arr[mid])
            {
            flag=1;
            break;
            }
            else if(arr[mid] > sr)
            {
            high = mid-1;
            }
            else
            {
            low = mid+1;
            }
        }
    
        if(flag==1)
        System.out.println("Number is present in the array");
        else
        System.out.println("Number is not present in the array");
    }
}
