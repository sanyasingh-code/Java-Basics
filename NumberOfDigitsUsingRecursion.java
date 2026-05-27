import java.util.*;
class Main
{
    static int count(int n)
    {
        if(n == 0)
        return 0;

        return 1 + count(n / 10);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.println("Number of digits: " + count(num));
    }
}
