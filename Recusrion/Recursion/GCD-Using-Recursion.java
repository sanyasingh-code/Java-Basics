import java.util.*;
class Main
{
    static int gcd(int a, int b)
    {
        if(b == 0)
        return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.println("GCD = " + gcd(a, b));
    }
}
