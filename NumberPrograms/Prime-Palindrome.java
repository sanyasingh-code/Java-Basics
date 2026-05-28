import java.util.*;

public class Main {

    public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int num, d=0, temp=0, rev=0, flag=0;
    System.out.println("Enter number: ");
    num = in.nextInt();
    temp=num;
    
    for(int i=1; i<=num; i++)
    {
        if(num%i==0)
        flag++;
    }
    
    while(num!=0)
    {
        d = num%10;
        rev = rev*10+d;
        num = num/10;
    }
    
    if(flag==2 && temp==rev)
    System.out.println("Prime Palindrome number");
    else
    System.out.println("Not a Prime Palindrome number");
}
}
    
