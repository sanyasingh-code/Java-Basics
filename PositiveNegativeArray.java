import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int pos=0, neg=0;
        int arr[] = {1,-2,-3,-4,5};
        for(int i=0; i<5; i++)
        {
            arr[i] = in.nextInt();
        }
        for(int i=0; i<5; i++)
        {
            if(arr[i] >= 0)
            {
                pos++;
            }
            else
            {
                neg++;
            }
        }
        System.out.println("Positive: " +pos);
        System.out.println("Negative: " +neg);
    }
}
