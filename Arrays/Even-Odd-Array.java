import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int even=0, odd=0;
        int arr[] = {1,2,3,4,5};
        for(int i=0; i<5; i++)
        {
            arr[i] = in.nextInt();
        }
        for(int i=0; i<5; i++)
        {
            if(arr[i] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Even: " +even);
        System.out.println("Odd: " +odd);
    }
}
