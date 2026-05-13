import java.util.*;

public class Main {

    public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int num,d,rev=0,temp=0;
    
    System.out.println("Enter 1st number: ");
    num = in.nextInt();
    temp = num;

    while(temp!=0)
    {
        d = temp%10;
        rev = rev*10+d;
        temp = temp/10;
    }
    if(num==rev)
    System.out.println("It is a palindrome number");
    else
    System.out.println("It is not a palindrome number");
    
}
}
