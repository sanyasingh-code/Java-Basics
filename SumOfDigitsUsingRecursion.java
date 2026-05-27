import java.util.*;
class Main
{
    static int sum(int n)
    {
        if(n == 0)
        return 0;

        return (n % 10) + sum(n / 10);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.println("Sum of digits: " + sum(num));
    }
}
