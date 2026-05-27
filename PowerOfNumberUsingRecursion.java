import java.util.*;
class Main
{
    static int power(int a, int b)
    {
        if(b == 0)
        return 1;

        return a * power(a, b - 1);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = in.nextInt();
        System.out.print("Enter power: ");
        int b = in.nextInt();
        int p = power(a, b);
        System.out.println("Power of number = " + p);
    }
}
