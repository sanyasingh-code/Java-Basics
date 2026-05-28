import java.util.*;

public class Main {

    public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int num, f=1;
    System.out.println("Enter number: ");
    num = in.nextInt();
    for(int i=1; i<=num; i++)
    {
        f = f*i;
    }
    System.out.println("Factorial of a number: " +f);
}
}
