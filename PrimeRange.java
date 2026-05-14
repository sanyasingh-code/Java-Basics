import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a=0, b=0, count=0;
        System.out.println("Enter term from which you want the prime numbers: ");
        a = in.nextInt();
        System.out.println("Enter last term till you want the prime numbers: ");
        b = in.nextInt();
        
        for(int num=a; num<=b; num++)
        {
            int c=0;
            for(int i=1; i<=num; i++)
            {
               if(num%i == 0)
               c++;
            }
            if(c==2)
            {
            System.out.print(num + " ");
            count++;
            }
        }
         System.out.println("\nTotal Prime Numbers are: " +count);
    }
}
