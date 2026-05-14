import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num, sum=0, d=0, temp=0;
        System.out.println("Enter number: ");
        num = in.nextInt();
        temp=num;
        
        while(num!=0)
        {
            d = num%10;
            sum = sum + (d*d*d);
            num = num/10;
        }
        
        if(sum==temp)
         System.out.println("It is an Armstrong Number");
        else
         System.out.println("Not an Armstrong Number");
    }
}
