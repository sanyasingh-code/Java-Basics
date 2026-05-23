import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 5};
        int n = 5, missing=0;
        int expected_sum = n*(n + 1)/2;
        int actual_sum = 0;
        for(int i=0; i<arr.length; i++)
        {
           actual_sum = actual_sum + arr[i];
        }
        
        missing = expected_sum - actual_sum;
        System.out.println("Missing number: " +missing);
    }
}
