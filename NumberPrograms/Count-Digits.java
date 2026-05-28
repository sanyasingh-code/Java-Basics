import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num, c=0, d=0;
        System.out.println("Enter number: ");
        num = in.nextInt();
        
        while(num!=0)
        {
            d = num%10;
            c++;
            num = num/10;
        }
        
        System.out.println("Number of Digits: " +c);
    }
}
