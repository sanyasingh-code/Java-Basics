import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter 1st number: ");
        num = in.nextInt();
        
        if(num%2 == 0)
         System.out.println("Number is even: " +num);
        else
         System.out.println("Number is odd: " +num);
    }
}
