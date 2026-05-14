import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num, rev=0, d=0, temp=0;
        System.out.println("Enter number: ");
        num = in.nextInt();
        temp = num;
        
        while(num!=0)
        {
            d = num%10;
            rev = rev*10+d;
            num = num/10;
        }
        
        System.out.println("Reverse Number: " +rev);
    }
}
