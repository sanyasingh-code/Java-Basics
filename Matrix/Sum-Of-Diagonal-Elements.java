import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int arr[][] = {{1, 2, 3}, {4, 5, 6} };
        int sum_left=0, sum_right=0;

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(i == j)
                {
                    sum_left += arr[i][j];
                }

                if(i + j == 3 - 1)
                {
                    sum_right += arr[i][j];
                }
            }
        }
        System.out.println("Sum of Left diagonal: " + sum_left);
        System.out.println("Sum of Right diagonal: " + sum_right);
    }
}
