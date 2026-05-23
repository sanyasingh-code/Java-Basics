import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = {{1, 2},{3, 4}};
        System.out.println("Enter the element to be searched: ");
        int search = in.nextInt();
        int c=0;
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                if(arr[i][j] == search)
                {
                    c++;
                    break;
                }
            }
        }
        if(c==1)
        System.out.println("Element Found");
        else
         System.out.println("Element is not there");
    }
}
