import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int max=0;
        int arr[][] = {{1, 2, 3}, {4,5,6}};
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum Element: " +max);
    }
}
