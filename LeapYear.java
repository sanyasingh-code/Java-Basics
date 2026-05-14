import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int yr;
        System.out.println("Enter year: ");
        yr = in.nextInt();
        
        if((yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0)
         System.out.println("It is a leap year");
        else
         System.out.println("It is not a leap year");
    }
}
