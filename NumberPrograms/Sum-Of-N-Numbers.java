import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int sum=0, term=0;
        System.out.println("Enter last term till you want to add: ");
        term = in.nextInt();
        
        for(int i=0; i<=term; i++)
        {
            sum = sum+i;
        }
        System.out.println("Sum of N terms: " +sum);
    }
}
