import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int arr1[] = {2, 4, 6, 8, 10};
        int arr2[] = {2, 6, 7, 4, 3};
        System.out.println("Common Elements Between Two Array: ");
        
        for(int i=0; i<arr1.length; i++)
        {
            int c=0;
            for(int j=0; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    c++;
                    break;
                }
            }
            if(c==1)
            {
               System.out.print(arr1[i] + " ");
            }
        }
    }
}
