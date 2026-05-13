import java.util.*;

public class Main {

    public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int term, num1=0, num2=1 ,sum=0;
    System.out.println("Enter number of terms till you want the series: ");
    term = in.nextInt();
    System.out.println("Fibonacci Series:");
    for(int i=0; i<=term; i++)
    {
        System.out.print(num1 + " ");
        sum = num1+num2;
        num1 = num2;
        num2 = sum;
    }
}
}
