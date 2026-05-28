import java.util.*;

public class Main {

    public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int num,i,flag=0;
    
    System.out.println("Enter 1st number: ");
    num = in.nextInt();
    for(i=1; i<=num; i++)
    {
        if(num % i == 0)
          flag++;
    }
    if(flag==2)
    System.out.println("It is a prime number");
    else
    System.out.println("It is not a prime number");
    
}
}
