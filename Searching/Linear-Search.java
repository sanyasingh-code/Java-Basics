import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int arr[]= new int[10];
        System.out.println("Enter elements: ");
        for(int i=0; i<10; i++)
        {
            arr[i]= in.nextInt();
        }
        for(int i=0; i<10; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int sr, flag=0;
        System.out.println("enter the no be searched ");
        sr= in.nextInt();
        for(int i=0; i<10; i++)
        {
            if(arr[i]==sr)
            flag++;
        }
        if(flag==1)
        System.out.println("Number is present in the array");
        else
        System.out.println("Number is not present in the array");
    }
}
