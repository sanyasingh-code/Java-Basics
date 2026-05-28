import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int arr1[][] = {{1, 2, 3}, {1, 3, 5}};
        int arr2[][] = {{1, 2, 3}, {1, 3, 5}};
        int sum[][]  = new int[2][3];
        
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of matrices:");
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
               System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
