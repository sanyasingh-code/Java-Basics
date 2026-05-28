import java.util.*;
class MatrixTranspose
{
    public static void main(String[] args)
    {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Original Matrix:");

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Transpose Matrix:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(arr[j][i] + " ");
            }

            System.out.println();
        }
    }
}
